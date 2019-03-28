package code;

import java.io.IOException;
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
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Valida() {
        super();
        // TODO Auto-generated constructor stub
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
		Pattern Nick = Pattern.compile("[a-zA-Z]{1,10}");
		Pattern Email = Pattern.compile("^[a-z0-9]{1,}(\\-)?(\\.)?[a-z0-9]{1,}@[a-z]{1,}(\\-)?[a-z]{1,}(\\.[a-z0-9]{2,}){1,}$");
		Pattern Pass = Pattern.compile("[a-zA-Z0-9]{8,}");
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
