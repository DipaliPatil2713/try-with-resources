package com.csi.new_scenario;

import java.util.Scanner;

// In this scenario we are gonna use try {} block with out catch and finally and its possible from java 1.7 

public class TryWithResourcesEx1 {
	public static void main(String[] args) {
		
//		Here we are used the try with resources the purpose of it is : 
//		1. It will avoid resource leakage 2. It will close object Automatically.
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Company name:");
			String companayName = scanner.next();
			 
			System.out.println(companayName);
			
//			scanner.close(); // we can also do it manually like this but we use above method it will close our object automatically and it reduce line of code
		}
	}

}
