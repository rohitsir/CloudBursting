package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Resources;

/**
 * Servlet implementation class Allot_Resources
 */
@WebServlet("/Allot_Resources")
public class Allot_Resources extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean available=false;
	public static ArrayList<Resources> 	al=new ArrayList<Resources>();
	public static ArrayList<Resources> 	alloted=new ArrayList<Resources>();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Allot_Resources() {
		super();
		// TODO Auto-generated constructor stub
	}
	static int x=0;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();

		String user = (String) session.getAttribute("user");

		String users = request.getParameter("users");
		String vms = request.getParameter("vms");
		String storage = request.getParameter("storage");
		String ram = request.getParameter("ram");
		String bw = request.getParameter("bw");
		String cpu = request.getParameter("cpu");

	
		Resources resources = new Resources();
		 
		resources.setUsers(Integer.parseInt(users));
		resources.setVms(Integer.parseInt(vms));
		resources.setStorage(Integer.parseInt(storage));
		resources.setRam(Integer.parseInt(ram));
		resources.setBw(Integer.parseInt(bw));
		resources.setCpu(cpu);
		resources.setServername(user);
		
		//add user request into arrayList

		al.add(resources);
		
		//allotment policy
		
		ArrayList <Resources> list=null;
		list=dao.DataDAO.serverDetails();

	 
		
		//finding location 
	  String location1=request.getRemoteAddr();
	
	  location.LookUpProgram.findLocation(location1);
	  System.out.println(location1);
	  Iterator<Resources> it=list.iterator();
	  
	  while(it.hasNext())
	  {
		  available=false;
		  Resources resources2=it.next();
		  System.out.println(resources2.getServername()+""+resources2.getUsers());
		  if((resources.getUsers()<=resources2.getUsers()) && (resources.getRam() <=resources2.getRam()) && (resources.getBw() <=resources2.getBw()) && (resources.getStorage()<=resources2.getStorage()) &&( resources.getVms()<=resources2.getVms()) )
		  {
			  alloted.add(resources);
			  available=true;
			resources2.setUsers((resources2.getUsers())-(resources.getUsers())); 
			resources2.setVms((resources2.getVms())-(resources.getVms()));
			resources2.setRam(resources2.getRam()-resources.getRam());
			resources2.setStorage(resources2.getStorage()-resources.getStorage());
			resources2.setBw(resources2.getBw()-resources.getBw());
			//update server resources 
			dao.DataDAO.updateResources(resources2);
			System.out.println(""+resources2.getUsers());
			 break; 
		  }
		  
	  }
	  response.setContentType("text/html");
	  if(available)
	  {
		  available=false;
	 	out.println(" <script type=\"text/javascript\">");
		out.println("alert('data is available');");
		out.println("location='./Home?type=user';");
		out.println("</script> ");
	  }
	  else
	  {
		  out.println(" <script type=\"text/javascript\">");
			out.println("alert('data is not  available i.e. public cloud partition');");
			out.println("location='http://mtech-cloudpartition.rhcloud.com';");
			out.println("</script> ");
		  
	  }

	/*	if (dao.DataDAO.check_Resources_Avability(resources)) {
			// System.out.println("private");

			/*System.out.println(Resources_Details_DAO.available_memory + "--" + Resources_Details_DAO.used_memory);
			System.out.println(Resources_Details_DAO.available_users + "--" + Resources_Details_DAO.used_users);
			System.out.println(Resources_Details_DAO.available_vms + "--" + Resources_Details_DAO.used_vms);
			System.out.println(Resources_Details_DAO.available_ram + "--" + Resources_Details_DAO.used_ram);
			System.out.println(Resources_Details_DAO.available_bw + "--" + Resources_Details_DAO.used_bw);

			 //response. sendRedirect("home.jsp");

			out.println("<script type=\"text/javascript\">");
			out.println("alert('data is available');");
			out.println("location='./Home?type=user';");
			out.println("</script>");
		} else {
			// System.out.println("public");

			// response. sendRedirect("./server1_home.jsp");
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('data is not  available i.e. public cloud partition');");
			out.println("location='./Home?type=server';");
			out.println("</script>");
		}
		
		*/
	  out.close();

	}

}
