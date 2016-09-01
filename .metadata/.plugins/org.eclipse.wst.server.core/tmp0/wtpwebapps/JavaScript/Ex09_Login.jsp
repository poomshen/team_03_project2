<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String userid = request.getParameter("txtuserid");
	String pwd = request.getParameter("txtpwd");
%>
ID:<%= userid %>
PWD<%=  pwd %>