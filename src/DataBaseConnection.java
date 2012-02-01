import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			conn = DriverManager.getConnection("jdbc:mysql://hanzo-db.local.hanzo.com.br/sampleDB", "root", "hanzo123");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return conn;
	}
}
