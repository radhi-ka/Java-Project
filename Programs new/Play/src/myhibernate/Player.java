package myhibernate;

public class Player {

	String pname;
	
    String pcountry;
    
	int pranking;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public int getPranking() {
		return pranking;
	}
	public void setPranking(int pranking) {
		this.pranking = pranking;
	}
	
	
	@Override
	public String toString() {
		return "Playerdetails [pname=" + pname + ", pcountry=" + pcountry + ", pranking=" + pranking + "]";
	}
	
}
