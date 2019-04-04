package code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectBBDD {

	static String DRIVER="org.hsqldb.jdbcDriver";
	static String URL="jdbc:hsqldb:C:\\Users\\pc10\\eclipse-workspace\\Nike\\WebContent\\WEB-INF\\db\\srv_db.tmp";
	private final static Logger LOGGER = Logger.getLogger("bitacora.subnivel.Control");
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,"sa", "");
		}catch(ClassNotFoundException | SQLException e) {
			LOGGER.log(Level.INFO, "Error: "+e);
		}
		return con;
	}
	
}
