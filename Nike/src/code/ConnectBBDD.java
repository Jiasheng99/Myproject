package code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBBDD {

	static String DRIVER="org.hsqldb.jdbcDriver";
	static String URL="jdbc:hsqldb:C:\\Users\\pc10\\eclipse-workspace\\Nike\\WebContent\\WEB-INF\\db\\srv_db.tmp";
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,"sa", "");
		}catch(ClassNotFoundException | SQLException e) {
			System.err.println("Error: "+e);
		}
		return con;
	}
	
	public ConnectBBDD() {
		super();
	}
}
