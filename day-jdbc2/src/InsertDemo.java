
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String INSERT_SQL = "insert into emp(empId,name,) values('100','Dev')";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db1");

			if (conn != null) {
				System.out.println("Got the connection");
			}
			stmt = conn.createStatement();
			int rowCount = stmt.executeUpdate(INSERT_SQL);

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
