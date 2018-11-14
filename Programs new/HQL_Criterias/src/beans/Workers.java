package beans;

public class Workers {

	private int wid;
	private String wname;
	private String wemail;
	private int wsal;
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWemail() {
		return wemail;
	}
	public void setWemail(String wemail) {
		this.wemail = wemail;
	}
	public int getWsal() {
		return wsal;
	}
	public void setWsal(int wsal) {
		this.wsal = wsal;
	}
	
	public Workers(int wid, String wname, String wemail, int wsal) {
		super();
		this.wid = wid;
		this.wname = wname;
		this.wemail = wemail;
		this.wsal = wsal;
	}
	
}
