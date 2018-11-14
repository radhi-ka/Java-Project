package com.springbasics.withinterface;

public class Traveller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here as interface is there it reduces the code replacement while implementing new class object. But still you have to change the java logic where there is a possibility of crshing everything.
		//You have to check the complete code flow and you have to test every class which takes a lot of time.To avoid this we use Spring.
		Vechicle veh= new Bike();
		veh.move();
	}

}
