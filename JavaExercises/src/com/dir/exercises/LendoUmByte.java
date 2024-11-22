package com.dir.exercises;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Cunha Galvao Florindo - 124110714
 */

import java.util.Scanner;

public class LendoUmByte {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int ent = sc.nextInt();
		
		System.out.println("dobro: " + ent * 2 + ", " + "triplo: " + ent * 3); 
		
		sc.close();
	}
}

