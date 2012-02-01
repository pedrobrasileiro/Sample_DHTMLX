import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sampleDB", "root", "");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return conn;
	}
}
