import java.sql.*;

public class Mainline {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/tiy";
		
		Connection conn = new Connection(url, "root", "admin");
	}

}
