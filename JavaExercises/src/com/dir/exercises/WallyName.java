package com.dir.exercises;

import java.util.Scanner;

public class WallyName {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 String[] names = sc.nextLine().split(" "); 
	 
	 String result = "?"; 
	 for (String name : names) {
		 if (name.length() == 5) result = name;
	 	}
	 
	 System.out.println(result);
	 
	 sc.close();
	}
}
