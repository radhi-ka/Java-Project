package com.easylearnjava.exceptionhandling;

public class WaysOfTryCatchBlocks {

	public static void main(String[] args) {
		try {
		} catch (Exception e) {
		}

		
		
		try {
		} catch (Exception e) {
		} finally {
		}

		
		
		
		try {
		} finally {
		}

		
		try {
			String s=null;
			try {
				int[] arr=new int[4];
				arr[7]=11;
			}finally {
				System.out.println("xzx");
			}
			
		}finally {
			System.out.println("xzx");
		}
		
	}
}
