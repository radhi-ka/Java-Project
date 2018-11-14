package beans;

public class Triangle {

	private String Type;
	private int Height;
	
	public Triangle(String Type) {
		this.Type=Type;
	}
	 //For constructor injection we are doing method overloading here
	public Triangle(String Type, int Height) {
		this.Type=Type;
		this.Height=Height;
	}
	
	public int getHeight() {
		return Height;
	}

	public String getType() {
		return Type;
	}

	/*public void setType(String type) {
		Type = type;
	}
*/
	public void draw() {
		System.out.println(getType()  + " Triangle drawn" + " with " + getHeight() + " meters");
	}
}
