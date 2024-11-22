package com.dir.exercises;

import java.util.Scanner; 

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author 
 */


public class MonotonusFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(),  num2 = sc.nextInt(),  num3 = sc.nextInt(),  num4 = sc.nextInt();
		String state = "FUNCAO NAO ESTRITAMENTE CRES/DECR";
		
		if (num2 > num1 && num3 > num2 && num4 > num3) {
			state = "POSSIVELMENTE ESTRITAMENTE CRESCENTE";
		} else if (num2 < num1 && num3 < num2  && num4 < num3) {
			state = "POSSIVELMENTE ESTRITAMENTE DECRESCENTE";
		}
		
		System.out.println(state);
		
		sc.close();
	}
		
	
}
