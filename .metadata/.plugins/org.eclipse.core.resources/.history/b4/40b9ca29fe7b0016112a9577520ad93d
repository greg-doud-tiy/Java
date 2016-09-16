package ssa;
import java.sql.*;

public class Db {
	public Connection conn = null;
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	public Db(String url, String usr, String pwd) throws SQLException {
		conn = DriverManager.getConnection(url, usr, pwd);
	}
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
