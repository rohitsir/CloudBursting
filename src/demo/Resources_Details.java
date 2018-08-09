package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Resources;
import dao.DataDAO;

/**
 * Servlet implementation class Allot_Resources
 */
@WebServlet("/Resources_Details")
public class Resources_Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int number_of_usres=3;
	PrintWriter out=null;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Resources_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		String servername=(String)session.getAttribute("user");
		out=response.getWriter();
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		String users = request.getParameter("users");
		String vms = request.getParameter("vms");
		String storage = request.getParameter("storage");
		String ram = request.getParameter("ram");
		String bw = request.getParameter("bw");
		String cpu = request.getParameter("cpu");
		
	/*	System.out.println(users);
		System.out.println(vms);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(bw);
		System.out.println(cpu);*/
		
		Resources resources=new Resources();
		resources.setUsers(Integer.parseInt(users));
		resources.setVms(Integer.parseInt(vms));
		resources.setStorage(Integer.parseInt(storage));
		resources.setRam(Integer.parseInt(ram));
		resources.setBw(Integer.parseInt(bw));
		resources.setCpu(cpu);
		resources.setServername(servername);
		
		 response.setContentType("text/html");
		if(DataDAO.setResources(resources))
		{
			out.println(" <script type=\"text/javascript\">");
			out.println("alert('Resources add successfully');");
			out.println("location='./success.jsp'");
			out.println("</script> ");
		 
		}
		else
		{
			
			out.println(" <script type=\"text/javascript\">");
			out.println("alert('Problem some where??');");
			out.println("location='./Computing_Capacity'");
			out.println("</script> ");
			 
		}
	
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
