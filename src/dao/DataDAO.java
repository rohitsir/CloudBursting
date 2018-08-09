package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Resources;

 

public class DataDAO {
	static long total_ram=16000;
	static long total_vms=4;
	static long total_bw=1000;
	static long total_users=5;
	static long total_memory;
	
	//
	static long used_ram;
	static long used_vms;
	static long used_bw;
	static long used_users;
	static long used_memory;
	
	static long available_ram;
	static long available_vms;
	static long available_bw;
	static long available_users;
	static long available_memory;
	
	public static boolean login(String uid,String ps,String type)
	{
		try {
			java.sql.Connection con = db.DemoConnection.DB();
			
			String query = "SELECT * FROM user_info where user_id=? and password=? and type=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, uid);
			pst.setString(2, ps);
			pst.setString(3, type);
			
			ResultSet rs = pst.executeQuery();
			 
			if (rs.next()) {
				return true;
				}

				rs.close();
				pst.close();
				con.close();
				 
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		return false;
	}
	
	public static boolean setResources(Resources rs)
	{
		
		try {
			java.sql.Connection con = db.DemoConnection.DB();
			
			String query = "insert into Resources_Table values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, 0);
			pst.setInt(2, rs.getUsers());
			pst.setInt(3, rs.getVms());
			pst.setLong(4, rs.getStorage());
			pst.setInt(5, rs.getRam());
			pst.setInt(6, rs.getBw());
			pst.setString(7, rs.getCpu());
			pst.setString(8,rs.getServername());
			
			
			 
			if (pst.executeUpdate()>0) {
				return true;
				}

				pst.close();
				con.close();
				 
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return false;
	}
	public static boolean check_Resources_Avability(Resources rs)
	{
		
		try {
			java.sql.Connection con = db.DemoConnection.DB();
			
			
			String query = "select * from  Resources_Table where users >= ? and vms >=? and storages>=? and ram>=? and bw>=? ";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, rs.getUsers());
			pst.setInt(2, rs.getVms());
			pst.setLong(3, rs.getStorage());
			pst.setInt(4, rs.getRam());
			pst.setInt(5, rs.getBw());
			 
			ResultSet r=pst.executeQuery();
			if (r.next()) {
				 
				return true;
				 
				}
			

				pst.close();
				con.close();
				 
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return false;
	}
	
	
	
	//code for find servers details
	
	public static ArrayList<Resources> serverDetails()
	{
		ArrayList<Resources> list=new ArrayList<Resources>();
		
		try {
			java.sql.Connection con = db.DemoConnection.DB();
			
			
			String query = "select * from  Resources_Table";
			PreparedStatement pst = con.prepareStatement(query);
			
			
			 
			ResultSet r=pst.executeQuery();
		   while (r.next()) {
				 
			   Resources resources = new Resources();
				resources.setUsers(r.getInt(2));
				resources.setVms(r.getInt(3));
				resources.setStorage(r.getInt(4));
				resources.setRam(r.getInt(5));
				resources.setBw(r.getInt(6));
				resources.setCpu(r.getString(7));
				resources.setServername(r.getString(8));
				list.add(resources);
				 
				}
			

				pst.close();
				con.close();
				 
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return list;
	}
 	
  //update resources 
	
	public static boolean updateResources(Resources rs)
	{
		
		try {
			java.sql.Connection con = db.DemoConnection.DB();
			
			String query = "update Resources_Table set Users=?,Vms=?,Storages=?,Ram=?,Bw=? where server=?";
		
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, rs.getUsers());
			pst.setInt(2, rs.getVms());
			pst.setLong(3, rs.getStorage());
			pst.setInt(4, rs.getRam());
			pst.setInt(5, rs.getBw());
			pst.setString(6, rs.getServername());
		
			
			
			 
			if (pst.executeUpdate()>0) {
				return true;
				}

				pst.close();
				con.close();
				 
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return false;
	}
}
