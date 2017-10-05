<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<LINK REL=STYLESHEET HREF="style.css" TYPE="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comp 3613 Lab04</title>
</head>
<body>
	<h1>Comp 3613 Lab04</h1>
	<h2>Pingtao Ye A00983709</h2>
<%!
private String instruction;
public void jspInit() {
	ServletConfig config = getServletConfig();
	instruction = config.getInitParameter("instruction");
}
%>
<Center>
<h1><%= instruction %></h1>
<h3>The current time is:</h3>
<h3><%= new java.util.Date()%></h3>
</Center>
<form action = "lab04" method = "get">
  <CENTER><p><input type = "text" name = "input" />
  <h3>Convert temerature to:</h3>
  <input type = "radio" name = "temp" value = "celsius"> Celsius
  <input type = "radio" name = "temp" value = "fahrenheit"> Fahrenheit
  <br><input type = "submit" value = "Convert"/></CENTER>
</form>
</body>
</html>