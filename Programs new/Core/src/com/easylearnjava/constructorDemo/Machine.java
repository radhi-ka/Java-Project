package com.easylearnjava.constructorDemo;

public class Machine {

	private int id;
	private String name;
	private int rolno;
	private String machineName;
	
	//by default, the compiler will create one default constructor for us only when no constructor is defined by u
	
	public Machine() {
		System.out.println("Hello I am learning Java");
		machineName="RBVR";
	}
	
	
	//constructor declaration
	public Machine(int idno, String namen, int rolnum, String machineNames) {
		
		this.id = idno;
		this.name = namen;
		this.rolno = rolnum;
		machineName = machineNames;
	}

	public Machine(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public String getmachineName() {
		return machineName;
	}
	/* public void setmachineName(String machineName) {
		machineName = machineName;
	} */
	
}
