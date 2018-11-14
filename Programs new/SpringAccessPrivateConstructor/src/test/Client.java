package test;

import java.lang.reflect.Constructor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try{
		Class c=Class.forName("beans.Test");
		Constructor con[]=c.getDeclaredConstructors();
		            con[0].setAccessible(true);
		            con[0].newInstance(null);
		
	}catch(Exception e){
		
	}
	}

}
