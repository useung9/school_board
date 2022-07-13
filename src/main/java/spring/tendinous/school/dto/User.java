package spring.tendinous.school.dto;

import java.sql.Date;

public class User {
	private String id;
	private String pw;
	private String name;
	private int admincheck;
	private Date regidate;
	private Date modifydate;
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", admincheck=" + admincheck + ", regidate="
				+ regidate + ", modifydate=" + modifydate + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdmincheck() {
		return admincheck;
	}
	public void setAdmincheck(int admincheck) {
		this.admincheck = admincheck;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	public Date getModifydate() {
		return modifydate;
	}
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}
	public User(String id, String pw, String name, int admincheck, Date regidate, Date modifydate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.admincheck = admincheck;
		this.regidate = regidate;
		this.modifydate = modifydate;
	}
	
	
	public User() {
		
	}
}
