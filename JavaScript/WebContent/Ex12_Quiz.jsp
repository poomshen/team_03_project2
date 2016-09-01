<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
   String title = request.getParameter("title");
 	String content = request.getParameter("content");
%>
서버에 받는 값 Client 출력
<hr>
title : <%= title %>
content: <%= content %>