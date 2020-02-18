package eu.ensup.servlethtmlproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MethodsServlet
 */

@WebServlet("/Accueil")
public class MethodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MethodsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MethodsServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Liste des 10 méthodes HTTPRequest  </h1>");
            out.println("<h2>- Servlet MethodsServlet at " + request.getContextPath() + "</h2>");
            out.println("<h2>- Path info : " + request.getPathInfo()+ "</h2>");
            out.println("<h2>- Local adresse : " + request.getLocalAddr()+ "</h2>");
            out.println("<h2>- Méthode :  " + request.getMethod()+ "</h2>");
            out.println("<h2>- Server name : " + request.getServerName()+ "</h2>");
            out.println("<h2>- Remote host :  " + request.getRemoteHost()+ "</h2>");
            out.println("<h2>- Remote user : " + request.getRemoteUser()+ "</h2>");
            out.println("<h2>- Local name : " + request.getLocalName()+ "</h2>");
            out.println("<h2>- Protocol : " + request.getProtocol()+ "</h2>");
            out.println("<h2>- CharacterEncoding : " + request.getCharacterEncoding()+ "</h2>");
            out.println("<h2>- Querry string : " + request.getQueryString()+ "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

}
