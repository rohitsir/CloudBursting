package dao;



import bean.Resources;
import demo.SessionCounter;

 

public class Resources_Details_DAO {
	public static long total_ram=16000;
	public static long total_vms=4;
	public static long total_bw=1000;
	public static long total_users=5;
	public static long total_memory;
	
	//
	public static long used_ram;
	public static long used_vms;
	public static long used_bw;
	public static long used_users;
	public static long used_memory;
	
	public static long available_ram;
	public static long available_vms;
	public static long available_bw;
	public static long available_users;
	public static long available_memory;
	public static boolean check_Resources_Avability(Resources rs)
	{
		
	   Runtime r = Runtime.getRuntime();
	   total_memory = Runtime.getRuntime().totalMemory();
	   available_memory = Runtime.getRuntime().freeMemory();
	   
	   if(available_memory > rs.getStorage() && total_users> SessionCounter.activeSessions )
	   {   
		   return true; 
	   }
	   
		return false;
	}

}
