<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
   String title = request.getParameter("title");
 	String content = request.getParameter("content");
%>
서버에 받는 값 Client 출력
<hr data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-14" data-genuitec-path="/JavaScript/WebContent/Ex12_Quiz.jsp">
title : <%= title %>
content: <%= content %>