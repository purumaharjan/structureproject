<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<%@ page
	import="org.springframework.security.core.AuthenticationException"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<META http-equiv="content-type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" href="resources/style/login.css" />
</head>

<body> 
<div id="content" class="container">
		<div class="loginContainer">
			<form:form action="/admin/j_spring_security_check" method="POST">
			
				<div class="userName">
					<label class="label">Username:</label>
					<input id="j_username" name="j_username" class="textbox" type="text" />	
                    <a href="registration.htm">Register?</a>
				</div>
				
			
				<div class="userPassword">
					<label class="label">Password:</label>
					<input id="j_password" name="j_password" class="textbox" type="password" />
					<a>Forget?</a>			
				</div>
				
				<div class="userCheckBox">
			        <input type="checkbox" id="_spring_security_remember_me" name="_spring_security_remember_me" value="on"/>
			        <label class="label">Remember me</label>
				</div>
                
				<div class="loginButton">
        			<input id="loginBtn" type="submit" value="Login"/>
     			</div>

     	</form:form>
   
        

 	 </div>
</div>
</body>
</html>