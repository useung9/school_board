package spring.tendinous.school.dto;

import java.sql.Date;

public class Board {
	private int bnum;
	private String bid;
	private String bsubject;
	private String bcontent;
	private int breadcnt;
	private int blikecnt;
	private int bdislikecnt;
	private Date regidate;
	private Date modifydate;
	private String removeyn;
	@Override
	public String toString() {
		return "Board [bnum=" + bnum + ", bid=" + bid + ", bsubject=" + bsubject + ", bcontent=" + bcontent
				+ ", breadcnt=" + breadcnt + ", blikecnt=" + blikecnt + ", bdislikecnt=" + bdislikecnt + ", regidate="
				+ regidate + ", modifydate=" + modifydate + ", removeyn=" + removeyn + "]";
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBsubject() {
		return bsubject;
	}
	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getBreadcnt() {
		return breadcnt;
	}
	public void setBreadcnt(int breadcnt) {
		this.breadcnt = breadcnt;
	}
	public int getBlikecnt() {
		return blikecnt;
	}
	public void setBlikecnt(int blikecnt) {
		this.blikecnt = blikecnt;
	}
	public int getBdislikecnt() {
		return bdislikecnt;
	}
	public void setBdislikecnt(int bdislikecnt) {
		this.bdislikecnt = bdislikecnt;
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
	public String getRemoveyn() {
		return removeyn;
	}
	public void setRemoveyn(String removeyn) {
		this.removeyn = removeyn;
	}
	public Board(int bnum, String bid, String bsubject, String bcontent, int breadcnt, int blikecnt, int bdislikecnt,
			Date regidate, Date modifydate, String removeyn) {
		super();
		this.bnum = bnum;
		this.bid = bid;
		this.bsubject = bsubject;
		this.bcontent = bcontent;
		this.breadcnt = breadcnt;
		this.blikecnt = blikecnt;
		this.bdislikecnt = bdislikecnt;
		this.regidate = regidate;
		this.modifydate = modifydate;
		this.removeyn = removeyn;
	}
	
	public Board() {
		
	}
}
