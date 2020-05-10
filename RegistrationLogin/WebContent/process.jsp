<%@page import ="bean.RegisterDAO"%>

<jsp:useBean id = "obj" class ="bean.User"/>
<% //<jsp:setProperty name ="obj" property ="*"/> %>


<%

String name = request.getParameter("uname");
String email = request.getParameter("uemail");
String password = request.getParameter("upassword");


obj.setName(name);
obj.setEmail(email);
obj.setPassword(password);


out.print(obj.getName());


int status = RegisterDAO.register(obj);
if(status > 0)
	out.print("   Record addedd successfully !");
%>

<jsp:include page ="loginIndex.jsp"></jsp:include>	







