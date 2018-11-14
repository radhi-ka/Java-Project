package beans;

public class SW extends Employee {
	
	private String team;

	public SW(int id, String name, String email, String team) {
		super(id, name, email);
		// TODO Auto-generated constructor stub
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
