
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		String INSERT_SQL = "insert into emp(empno,empno,name,city,salary) values(?,?,?,?)";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

			if (conn != null) {
				System.out.println("Got the connection");
			}
			pst = conn.prepareStatement(INSERT_SQL);

			pst.setInt(1, 101);
			pst.setString(2, "Dev");
			pst.setString(3, "Basti");
			pst.setDouble(4, 55000);
			int rowCount = pst.executeUpdate();
			if (rowCount == 1) {
				System.out.println("1 Row Inserted");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver could not be found....");
		} catch (SQLException e) {
			System.out.println("Exception:" + e);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
