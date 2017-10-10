package me.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.utils.PaymentUtil;


/*
 * 支付的Servlet程序
 */
public class PayServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取 订单号、金额、银行编码
		String orderid = request.getParameter("orderid"); // 订单号
		
		String money = request.getParameter("money"); // 金额
		String pd_FrpId = request.getParameter("pd_FrpId"); // 银行编码

		// 根据易宝接口 准备参数
		String p0_Cmd = "Buy";
		String p1_MerId = "10001126856"; // 商家编号  10001126856
		String p2_Order = orderid; // 订单号
		String p3_Amt = "0.01"; // 金额,单位是元
		String p4_Cur = "CNY";

		String p5_Pid = "";
		String p6_Pcat = "";
		String p7_Pdesc = "";
		// 支付成功回调地址 ---- 第三方支付公司会访问、用户访问
		// 第三方支付可以访问网址
		// 需要独立外网网卡
		String p8_Url = "http://127.0.0.1/estore/callback"; // 回调地址
		String p9_SAF = "";
		String pa_MP = "";
		String pr_NeedResponse = "1";

		// 将所有数据，进行数字签名 ，加密算法 由支付公司提供：注册时，第三方支付平台提供给商家的加密算法的摘要
		String keyValue = "69cl522AV6q613Ii4W6u8K6XuW8vM1N6bFgyv769220IuYe9u37N4y7rI4Pl"; // 密钥
		String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, keyValue);

		// 将所有数据 发送易宝指定地址
		request.setAttribute("pd_FrpId", pd_FrpId);
		request.setAttribute("p0_Cmd", p0_Cmd);
		request.setAttribute("p1_MerId", p1_MerId);
		request.setAttribute("p2_Order", p2_Order);
		request.setAttribute("p3_Amt", p3_Amt);
		request.setAttribute("p4_Cur", p4_Cur);
		request.setAttribute("p5_Pid", p5_Pid);
		request.setAttribute("p6_Pcat", p6_Pcat);
		request.setAttribute("p7_Pdesc", p7_Pdesc);
		request.setAttribute("p8_Url", p8_Url);
		request.setAttribute("p9_SAF", p9_SAF);
		request.setAttribute("pa_MP", pa_MP);
		request.setAttribute("pr_NeedResponse", pr_NeedResponse);
		request.setAttribute("hmac", hmac);

		// 跳转确认支付页面
		request.getRequestDispatcher("/confirm.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
