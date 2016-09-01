package kosta;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonHelper {
	 private static Connection conn;
	 private static String ck = "";
	 public static Connection getConnection(String dsn){
		 try {
			if(conn == null){
			 	if(dsn.equals("mysql"))
			 	{
			 		ck = dsn;
			 		Class.forName("com.mysql.jdbc.Driver");
			 		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosatdb", "kosta", "1004");
			 	
			 	}else if(dsn.equals("oracle")){
			 		ck = dsn;
			 		Class.forName("oracle.jdbc.OracleDriver");
				 	conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kglim", "1004");
			 	}
			}else{
					 if(!ck.equals(dsn)){
						 if(dsn.equals("mysql")){
							ck = dsn;
					 		Class.forName("com.mysql.jdbc.Driver");
					 		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosatdb", "kosta", "1004");
						 }else if(dsn.equals("oracle")){
					 		ck = dsn;
					 		Class.forName("oracle.jdbc.OracleDriver");
						 	conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kglim", "1004");
						 }
					 }	
			 }
			return conn;
		 } catch (Exception e) {
			e.printStackTrace();
		}finally{
			return conn;
		}
	 }
	
	 public static Connection getConnection(String dsn, String uid, String pwd){
		 try {
			 if(conn == null){
			 	if(dsn.equals("mysql"))
			 	{
			 		ck = "mysql";
			 		Class.forName("com.mysql.jdbc.Driver");
			 		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosatdb",uid, pwd);
			 	
			 	}else if(dsn.equals("oracle")){
			 		ck = "oracle";
			 		Class.forName("oracle.jdbc.OracleDriver");
				 	conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", uid, pwd);
			 	}	
			 }else{
				 if(!ck.equals(dsn)){
					 if(dsn.equals("mysql"))
					 	{
					 		ck = "mysql";
					 		Class.forName("com.mysql.jdbc.Driver");
					 		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosatdb",uid, pwd);
					 	
					 	}else if(dsn.equals("oracle")){
					 		ck = "oracle";
					 		Class.forName("oracle.jdbc.OracleDriver");
						 	conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", uid, pwd);
					 	}
				 }
			 }
			 return conn;
		 } catch (Exception e) {
			e.printStackTrace();
		}finally{
			return conn;
		}
	 }
	 
	 public static void close(Statement stmt){
		 if(stmt != null){
			 try {
				 stmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 }
	 }
	 public static void close(ResultSet rs){
		 if(rs != null){
			 try {
				 rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 }
	 }
	 public static void close(PreparedStatement pstmt){
		 if(pstmt != null){
			 try {
				 pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 }
	 }
}
