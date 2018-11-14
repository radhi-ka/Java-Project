package beans;

public class HW extends Employee {

	private int phno;
	public HW(int id, String name, String email, int phno) {
		super(id, name, email);
		// TODO Auto-generated constructor stub
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}

}
