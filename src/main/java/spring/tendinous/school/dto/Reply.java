package spring.tendinous.school.dto;

import java.sql.Date;

public class Reply {
	private int rnum;
	private int rbnum;
	private String rid;
	private String rcontent;
	private int restep;
	private int relevel;
	private Date regidate;
	private Date modifyDate;
	
	public Reply() {
		
	}

	@Override
	public String toString() {
		return "Reply [rnum=" + rnum + ", rbnum=" + rbnum + ", rid=" + rid + ", rcontent=" + rcontent + ", restep="
				+ restep + ", relevel=" + relevel + ", regidate=" + regidate + ", modifyDate=" + modifyDate
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public int getRbnum() {
		return rbnum;
	}

	public void setRbnum(int rbnum) {
		this.rbnum = rbnum;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public int getRestep() {
		return restep;
	}

	public void setRestep(int restep) {
		this.restep = restep;
	}

	public int getRelevel() {
		return relevel;
	}

	public void setRelevel(int relevel) {
		this.relevel = relevel;
	}

	public Date getRegidate() {
		return regidate;
	}

	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Reply(int rnum, int rbnum, String rid, String rcontent, int restep, int relevel, Date regidate,
			Date modifyDate) {
		super();
		this.rnum = rnum;
		this.rbnum = rbnum;
		this.rid = rid;
		this.rcontent = rcontent;
		this.restep = restep;
		this.relevel = relevel;
		this.regidate = regidate;
		this.modifyDate = modifyDate;
	}
	
	

}
