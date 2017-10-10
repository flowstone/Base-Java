package me.xueyao.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.utils.DirUtils;
import me.xueyao.utils.UUIDUtils;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建 一个工厂对象,帮助upload,解析请求,解析完成后数据存贮在FileItem
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//创建解析文件上传请求的核心对象
		ServletFileUpload upload = new ServletFileUpload(factory);
		//解析请求
		List<FileItem> items;
		try {
			items = upload.parseRequest(request);
			System.out.println(items);
			for (FileItem item : items) {
				//需要不同数据,不同处理
				if (item.isFormField()) {
					//普通文本数据
					String name = item.getFieldName();
					String value = item.getString();
					System.out.println(name+"===="+value);
				} else {
					//文件上传数据
					//上传文件的文件名
					String fileName = item.getName();
					//在输出之前,修改文件名=========
					fileName = UUIDUtils.getUUID()+fileName;
					//在输出之前,修改文件名=========
					
					
					//保存路径
					String realPath = getServletContext().getRealPath("/upload");
					//=========目录打散begin==========
					String dir = DirUtils.getDir(fileName);
					//保证数据文件夹存在
					new File(realPath, dir).mkdirs();
					//=========目录打散end=======
					try {
						//将文件输出到服务器
						item.write(new File(realPath, fileName));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
