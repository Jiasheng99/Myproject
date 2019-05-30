package code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class Login
 * @author Jiasheng
 * This class is for verify the users who want login or register to de bbdd
 */
public class Login {
	
	private Login() {
	}
	
	/**
	 * @param uName This parameter is for user name
	 * @param uPass	This parameter is for user password
	 * @param uEmail This parameter is for user email
	 * @return The result is false
	 */
	
	public static boolean insertUser(String uName, String uPass, String uEmail) {
		Connection con;
		con=ConnectBBDD.getConnection();
		PreparedStatement ps =null;
		Connection conn;
		conn=ConnectBBDD.getConnection();
		PreparedStatement prest =null;
		ResultSet resultados =null;
		
		try {
			String consulta1 = "select * from users where nick=?;";
			prest=conn.prepareStatement(consulta1);
			prest.setString(1, uName);
			resultados=prest.executeQuery();
			if (resultados.next()) {
				return false;
			}else {
				String consulta = "insert into USERS (NICK,EMAIL,PASS) VALUES(?,?,?);";
				ps=con.prepareStatement(consulta);
				ps.setString(1, uName);
				ps.setString(2, uPass);
				ps.setString(3, uEmail);
				if(ps.executeUpdate()==1) {
					return true;
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					ps.close();
				}catch (SQLException e) { 
					e.printStackTrace();
				}
			}
			if (prest != null) {
			    try {
			        prest.close();
			    } catch (SQLException e) { 
			    	e.printStackTrace();
			    }
			}
			if(resultados != null) {
				try {
					resultados.close();
				}catch (SQLException e) { 
					e.printStackTrace();
				}
			}
		}
		return false;
	}

}