package kosta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDTO {
	
	PreparedStatement stmt = null;
	ResultSet rs = null;
	SingletonHelper singlet = new SingletonHelper();
	Connection conn = singlet.getConnection("oracle");
	
	public static  MemberDTO dto = new MemberDTO();
	public MemberDTO getInstance(){
		dto = new MemberDTO();
		return dto;
	}
	
	public void insertMember(String name, String id , String pass){
		try {
			String sql = "insert into TEAM02 Values(?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,id);
			stmt.setString(2,name);
			stmt.setString(3,pass);
			int row = stmt.executeUpdate();
			if(row >0){
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
		}catch (SQLException e) {
			System.out.println("아이디 중복.");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean logingck(String id){
		
		
		return true;
	}
	
	public boolean logingck(String id ,String pass){
		try {
			String sql = "select * from TEAM02 where id=? and Password=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			return (rs.next());
		} catch (SQLException e) {
			System.out.println("");
		}
		return false;
	}
	
}
