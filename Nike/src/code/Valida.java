package code;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Valida
 */
@WebServlet("/Valida")
public class Valida extends HttpServlet {
    Properties prop = new Properties();
	InputStream is = null;
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Valida() {
        super();
        final Logger LOGGER = Logger.getLogger("code");
        // TODO Auto-generated constructor stub
		try {
			is = new FileInputStream("../resources/pattern.properties");
			prop.load(is);
		} catch(IOException e) {
			LOGGER.log(Level.INFO, "Error: "+e);
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		Pattern Nick = Pattern.compile(prop.getProperty("servidor.datos1"));
		Pattern Email = Pattern.compile(prop.getProperty("servidor.datos2"));
		Pattern Pass = Pattern.compile(prop.getProperty("servidor.datos3"));
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		Matcher N = Nick.matcher(nick);
		Matcher E = Email.matcher(email);
		Matcher P = Pass.matcher(pass);
		if (N.find()) {
			if (E.find()) {
				if (P.find()) {
					if (Login.insertUser(nick,email,pass) == true) {
						response.sendRedirect("./jsp/bienvenido.jsp");
					}else if(Login.insertUser(nick,email,pass) == false) {
						response.sendRedirect("./jsp/nobienvenido.jsp");
					}
				}else {
					response.sendRedirect("./jsp/Registre_PASSNOT_OK.jsp");
				}
			}else {
				response.sendRedirect("./jsp/Registre_EMAILNOT_OK.jsp");
			}
		} else {
			response.sendRedirect("./jsp/Registre_NICKNOT_OK.jsp");
		}
	}

}
