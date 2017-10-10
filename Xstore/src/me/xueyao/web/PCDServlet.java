package me.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flexjson.JSONSerializer;
import me.xueyao.base.BaseServlet;
import me.xueyao.domain.PCD;
import me.xueyao.service.PCDService;
import me.xueyao.service.impl.PCDServiceImpl;


public class PCDServlet extends BaseServlet {

   
	public void getData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		PCDService pcdService = new PCDServiceImpl();
		List<PCD> list = pcdService.getData(pid);
		
		JSONSerializer jsonSerializer = new JSONSerializer();
		String serialize = jsonSerializer.serialize(list);
		
		response.getWriter().write(serialize);
	}


}
