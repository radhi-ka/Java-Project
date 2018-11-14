package com.springbasics.withclasses;

public class Traveller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Car c= new Car();
		c.rent();*/  //So in this way if you want to create a new object of new class you have to edit the previous code completely which is tightly bonded.So
		//The next solution raised here is using interfaces.Lets see that in the with interface package.
		
		Bike b= new Bike();
		b.move();
	}

}
