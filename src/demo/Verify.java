package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 

/**
 * Servlet implementation class Verify
 */
@WebServlet("/Verify")
public class Verify extends HttpServlet   {
	private static final long serialVersionUID = 1L;
	public static int activeSessions = 0;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uid=request.getParameter("uid");
		String ps=request.getParameter("pass");
		String type=request.getParameter("type");
		if(dao.DataDAO.login(uid, ps, type))
		{
			HttpSession session=request.getSession(true);
			SessionCounter.sessionCreated();
			session.setAttribute("user", uid);
			
			response.sendRedirect("./Home?type="+type);
		}
		else
		{
			response.sendRedirect("./index.html");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	 
  
}
