package bean;

public class Resources {
	int users;
	int vms;
	long storage;
	int ram;
	int bw;
	String cpu;
	String servername;
	
	public Resources() {
		super();
	}
	public Resources(int users, int vms, long storage, int ram, int bw, String cpu,String servername) {
		super();
		this.users = users;
		this.vms = vms;
		this.storage = storage;
		this.ram = ram;
		this.bw = bw;
		this.cpu = cpu;
		this.servername=servername;
	}
	public int getUsers() {
		return users;
	}
	public void setUsers(int users) {
		this.users = users;
	}
	public String getServername() {
		return servername;
	}
	public void setServername(String servername) {
		this.servername = servername;
	}
	public int getVms() {
		return vms;
	}
	public void setVms(int vms) {
		this.vms = vms;
	}
	public long getStorage() {
		return storage;
	}
	public void setStorage(long storage) {
		this.storage = storage;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getBw() {
		return bw;
	}
	public void setBw(int bw) {
		this.bw = bw;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
