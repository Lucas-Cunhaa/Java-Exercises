package com.dir.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherNotes {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 ArrayList<Integer> grades = new ArrayList<>();
		 
		 int total = 0;
		 int biggest = 0; 
		 int smallest = 0;
		 int above = 0; 
		 int under = 0; 
		 
		 boolean firstEntry = true;
		 
		 while (true) {
			 String ent = sc.nextLine(); 
			 if (ent.equals("-")) break; 
			 
			 int grade = Integer.parseInt(ent.split(" ")[1]);
			 total += grade;
			 
			 if (grade >= 700) above += 1;
			 else under +=1;
				 
			 if (firstEntry) {
			        biggest = grade;
			        smallest = grade;
			        firstEntry = false; 
			    }
			 
			 if (grade > biggest) biggest = grade;
			 if (grade < smallest) smallest = grade;
			 
			 grades.add(grade);
		 }
		 
		 float media = (float) total / grades.size();
		 
		 System.out.println("maior: " + biggest);
		 System.out.println("menor: " + smallest);
		 System.out.println("media: " + media);
		 System.out.println("acima: " + above);
		 System.out.println("abaixo: " + under);
		 
		 
		 sc.close();
		}
}
