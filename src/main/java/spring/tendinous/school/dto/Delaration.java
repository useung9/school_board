package spring.tendinous.school.dto;

public class Delaration {
	private int dnum;
	private String dreportid;
	private String dcontent;
	private String dtargetid;
	private String dtargetcontent;
	private String removeyn;
	@Override
	public String toString() {
		return "Delaration [dnum=" + dnum + ", dreportid=" + dreportid + ", dcontent=" + dcontent + ", dtargetid="
				+ dtargetid + ", dtargetcontent=" + dtargetcontent + ", removeyn=" + removeyn + "]";
	}
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum = dnum;
	}
	public String getDreportid() {
		return dreportid;
	}
	public void setDreportid(String dreportid) {
		this.dreportid = dreportid;
	}
	public String getDcontent() {
		return dcontent;
	}
	public void setDcontent(String dcontent) {
		this.dcontent = dcontent;
	}
	public String getDtargetid() {
		return dtargetid;
	}
	public void setDtargetid(String dtargetid) {
		this.dtargetid = dtargetid;
	}
	public String getDtargetcontent() {
		return dtargetcontent;
	}
	public void setDtargetcontent(String dtargetcontent) {
		this.dtargetcontent = dtargetcontent;
	}
	public String getRemoveyn() {
		return removeyn;
	}
	public void setRemoveyn(String removeyn) {
		this.removeyn = removeyn;
	}
	public Delaration(int dnum, String dreportid, String dcontent, String dtargetid, String dtargetcontent,
			String removeyn) {
		super();
		this.dnum = dnum;
		this.dreportid = dreportid;
		this.dcontent = dcontent;
		this.dtargetid = dtargetid;
		this.dtargetcontent = dtargetcontent;
		this.removeyn = removeyn;
	}
	
	
	public Delaration() {
		
	}
}
