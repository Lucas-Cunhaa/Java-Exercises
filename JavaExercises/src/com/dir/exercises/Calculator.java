package com.dir.exercises;

import java.util.Scanner; 

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * 
 */


public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator = sc.nextLine();
		
		if (!"+".equals(operator) && !"-".equals(operator) && !"/".equals(operator) && !"*".equals(operator)) {
			System.out.println("ENTRADA INVALIDA");
			return;
		} 
		
		float num1 = sc.nextFloat(),  num2 = sc.nextFloat();
		float result = 0;
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "/":
			  if (num2 == 0) {
				  System.out.println("ERRO");
				  return;
			  }	
			  result = num1 / num2;
			  break;
		case "*":
			result = num1 * num2;
			break;
		}
		
		System.out.println("RESULTADO: " + result);
	}
		
	
}
