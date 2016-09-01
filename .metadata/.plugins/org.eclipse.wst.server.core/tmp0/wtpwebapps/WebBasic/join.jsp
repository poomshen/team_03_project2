<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입 완료</title>
<%@ page import="kosta.MemberDTO" %>

<%
		String username = request.getParameter("name");
		String  userid  = request.getParameter("id");
 		String  userpass = request.getParameter("pass");
		MemberDTO  dto = new MemberDTO();
		dto.insertMember(username, userid, userpass);
		/* System.out.println("username"+username);
		System.out.println("username"+userid);
		System.out.println("username"+userpass);
 		Connection conn = null;
 		DriverManager  driverManager = null;
 		PreparedStatement stmt = null;
 		ResultSet set = null;
 		try{
 			Class.forName("oracle.jdbc.OracleDriver");
		 	conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kglim", "1004");
		 
 		
 		String sql = "insert into TEAM02(ID,Name,Password) Values(?,?,?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1,userid);
		stmt.setString(2,username);
		stmt.setString(3,userpass);
		int row = stmt.executeUpdate();
		if(row >0){
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	} */
%>
<script>!function(e){var c={nonSecure:"8123",secure:"8124"},t={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=t[n]+r[n]+":"+c[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-33" data-genuitec-path="/WebBasic/WebContent/join.jsp">
	회원 가입 완료
</body>
</html>