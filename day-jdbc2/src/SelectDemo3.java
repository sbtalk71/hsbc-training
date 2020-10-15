
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		String INSERT_SQL = "select name from emp";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db1");

			if (conn != null) {
				System.out.println("Got the connection");
			}
			pst = conn.prepareStatement(INSERT_SQL);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}

			pst.setString(1, "101");
			pst.setString(2, "Dev");
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
