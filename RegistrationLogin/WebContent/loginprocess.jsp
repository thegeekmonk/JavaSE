<%@page import ="bean.LoginDAO" %>

<jsp:useBean id="obj" class ="bean.LoginBean"/>

<% 

boolean status;

String uemail = request.getParameter("email");
String upassword = request.getParameter("password");

obj.setEmail(uemail);
obj.setPassword(upassword);


//out.println(obj.getEmail());
//out.println(obj.getPassword());


status = LoginDAO.validate(obj);

if(status)
{
	out.println("You have successfully Logged In, Welcome !!");
	session.setAttribute("session","TRUE");		
}	
else
{
	out.println("Sorry , Email/Password Incorrect");
	
%>
  
   <jsp:include page ="loginIndex.jsp"></jsp:include>	

<%
}
 
%> 




