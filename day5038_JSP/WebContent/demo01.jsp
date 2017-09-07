<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试JSP脚本段</title>
</head>
<body>
	<h1>第1种脚本段</h1>
	<%!
		//定义型的语句
		int i = 10;
		void aa() {
			System.out.println("FFFF");
		}
		public class Test{
			void bb(){}
			private int i=100;
		}
	%>
</body>
</html>