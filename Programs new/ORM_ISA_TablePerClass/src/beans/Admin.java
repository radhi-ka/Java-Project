package beans;

public class Admin extends Employee {

	private String Dept;
	
	public Admin(int id, String name, String email, String Dept) {
		super(id, name, email);
		// TODO Auto-generated constructor stub
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}
}
