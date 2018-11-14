package com.easylearnjava.LoginApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {

		LoginApp app = new LoginApp();
		app.getUserInput();
	}

	private void getUserInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("The username is : ");
		String UserName = scan.next();
		System.out.println("The Password is : ");
		String Password = scan.next();
		
		LoginApp app=new LoginApp();
		boolean isvalidData=app.validateUserData(UserName, Password);
		if(!isvalidData) {
			System.out.println("Enter valid data");
			return;
		}
		boolean isValid=app.validateCredentials(UserName, Password);
		
		if(isValid) {
			System.out.println("Valid Credentials");
		}else {
			System.out.println("InValid Credentials");
		}
	}
	
	public boolean validateUserData(String uName, String pwd) {
		if(uName==null || pwd==null) {
			return false;
		}else if (uName.length()<5 || pwd.length()<5) {
			return false;
		}else {
			return true;
		}
		
	}
//compares the password
	private boolean validateCredentials(String UserName, String Password) {
		// TODO Auto-generated method stub
		LoginApp app = new LoginApp();
		String PswdFromDB=app.getPassword(UserName);
		
		if(PswdFromDB!=null && PswdFromDB.equals(Password)) {
			return true;
		}else{
			return false;
		}
	}

	private String getPassword(String UserName) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("raghu", "secret");
		map.put("allu", "secret1");
		return map.get(UserName);

	}

}
