package com.easylearnjava.interfaceDemo;

public class Tiger extends Animal implements WildAnimals {

	//When your parent class is abstract you have to use that abstract method in child class
	//like this or you need to declare abstract with class.
	//But this is not the right way of coding
	
	public void killHumanBeings() {
		System.out.println("Tiger kills human Beings");
	};
		public void killanimals() {
			System.out.println("kill animals");
		};
		 public void hunt() {
			 
		 };
	
}
