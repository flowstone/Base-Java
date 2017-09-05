package org.xueyao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.Product;
import org.xueyao.service.ProductService;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		List<Product> list = ProductService.getAllProducts();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("查询全部商品信息");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table align='center' width='50%' border='1'>");
		out.println("<tr><td>编号</td><td>名称</td><td>价格</td></tr>");
		for (Product product : list) {
			out.println("<tr>");
			out.println("<td>");
			out.println(product.getPid());
			out.println("</td>");
			out.println("<td>");
			out.println(product.getPname());
			out.println("</td>");
			out.println("<td>");
			out.println(product.getPrice());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
