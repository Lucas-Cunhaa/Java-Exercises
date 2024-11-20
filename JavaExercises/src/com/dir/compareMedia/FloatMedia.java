package com.dir.compareMedia;

import java.util.Scanner; 

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Cunha Galvao Florindo - 124110714
 */


public class FloatMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat(),  num2 = sc.nextFloat();
		float media = (num1 + num2) / 2;
		String state = "False!";
		if (media >= 7) {
			 state = "True!"; 
		}
		
		
		System.out.println("pass: " + state);
	}
}
