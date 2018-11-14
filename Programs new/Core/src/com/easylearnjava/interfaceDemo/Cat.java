package com.easylearnjava.interfaceDemo;

/* public abstract class Cat extends Animal {

} This is not accepted becoz a cat is seen in a real world
 which cannot be created as abstract. In this case interface comes.
*/

public abstract class Cat extends Animal implements PetAnimals, FashionShow {
	// This become abstract when you are unable to implement all
	// methods from the implemented interface or extended class
	public void playWithHuman() {
		
	};
	 public void walkWithHuman() {
		 
	 }
	@Override
	public void walkOnRamp() {
		// TODO Auto-generated method stub
		
	}
	
}


