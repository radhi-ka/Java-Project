package beans;

public class Car {

	private String carName;
	private Engine engine;

	public Car(){
		System.out.println("CAR");
	}
	
	

	public void setCarName(String carName) {
		this.carName = carName;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printCarData() {
		System.out.println("Carname: " + carName);
		System.out.println("Engine : " + engine);
	}
}
