package code;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
	public static boolean insertUser(String uName, String uPass, String uEmail) {
		Connection con;
		con=ConnectBBDD.getConnection();
		PreparedStatement ps =null;
		Connection conn;
		conn=ConnectBBDD.getConnection();
		PreparedStatement prest =null;
		
		try {
			String consulta1 = "select * from users where nick=?;";
			prest=conn.prepareStatement(consulta1);
			prest.setString(1, uName);
			ResultSet resultados=prest.executeQuery();
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
			try{
				if(ps != null) {
					ps.close();
				}
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	private static Object body() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object header(Object title) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object title(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object html() {
		// TODO Auto-generated method stub
		return null;
	}	
}