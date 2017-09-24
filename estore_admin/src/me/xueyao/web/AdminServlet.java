package me.xueyao.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.Good;
import me.xueyao.domain.Hot;
import me.xueyao.domain.Page;
import me.xueyao.service.GoodService;
import me.xueyao.service.impl.GoodServiceImpl;
import me.xueyao.utils.DirUtils;
import me.xueyao.utils.UUIDUtils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import flexjson.JSONSerializer;

public class AdminServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 查看所有商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void findAllGood(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		GoodService goodService = new GoodServiceImpl();
		List<Good> findAll = goodService.findAll();
		//将数据转换成json格式
		String serialize = new JSONSerializer().serialize(findAll);
		//System.out.println(serialize);
		response.getWriter().write(serialize);
	}
	
	/**
	 * 商品列表分页
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void pageGood(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//请求参数(page:用户要看的页码   rows:一页多少行数据)
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		//使用请求参数,获取分页数据
		//调用Service,获取分页数据
		GoodService goodService = new GoodServiceImpl();
		Page p = goodService.page(page,rows);
		
		Map map = new HashMap();
		map.put("total", p.getTotal());
		map.put("rows", p.getData());
		//将数据转换json格式
		String serialize = new JSONSerializer().include("rows").serialize(map);
		response.getWriter().write(serialize);
	}
	
	/**
	 * 添加商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public  void addGood(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//保证图片上传
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		//定义map,将数据保存起来,方便后期封装到对象中
		Map<String,String> map = new HashMap<>();
		
		try {
			//将请求解析完成,所有数据封装在FileItem中
			List<FileItem> list = upload.parseRequest(request);
			System.out.println(list);
			for (FileItem item : list) {
				if (item.isFormField()) {
					//普通文本数据
					String name = item.getFieldName();
					String value = item.getString("utf-8");
					map.put(name, value);
				} else {
					//文件上传数据,将数据保存到服务器硬盘
					String fileName = item.getName();
					//处理文件重名问题
					fileName = UUIDUtils.getUUID()+fileName;
					//获取文件要输出的位置
					//String realPath = getServletContext().getRealPath("/upload");
					String realPath = getServletContext().getRealPath("/");
					realPath = realPath.replace("webapps\\estore_admin\\", "");
					realPath = realPath+"picture";
					//目录打散
					String dir = DirUtils.getDir(fileName);
					//保证数字文件夹存在
					new File(realPath, dir).mkdirs();
					//保证数字文件夹存在
				
					try {
						item.write(new File(realPath+dir, fileName));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					map.put("imgurl", "/picture/"+dir+"/"+fileName);
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//封装数据
		Good g = new Good();
		try {
			BeanUtils.populate(g, map);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//调用Service方法,添加 商品
		GoodService goodService = new GoodServiceImpl();
		goodService.add(g);
		//跳转主页,让管理员可以选择后续操作
		response.sendRedirect(request.getContextPath());
		
	}
	/**
	 * 处理图片请求的方法
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public  void picture(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
		String imgurl = request.getParameter("imgurl");
		
		//加载图片数据
		String realPath = getServletContext().getRealPath("/");
		
		realPath = realPath.replace("\\webapps\\estore_admin", "");
		
		File file = new File(realPath, imgurl);
		
		//读取文件数据
		FileInputStream in = new FileInputStream(file);
		//向浏览器写出
		ServletOutputStream out = response.getOutputStream();
		//标准IO
		byte[] buf = new byte[8192];
		int len = 0;
		while ((len = in.read(buf))!= -1) {
			out.write(buf, 0, len);
		}
	}
	
	/**
	 * 热门商品统计
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public  void hot(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//调用Service方法,统计数据
		GoodService goodService = new GoodServiceImpl();
		List<Hot> list = goodService.hot();
		//将数据转换成json格式字符串
		String serialize = new JSONSerializer().serialize(list);
		//将数据发送到浏览器
		response.getWriter().write(serialize);
	}
	
	
}
