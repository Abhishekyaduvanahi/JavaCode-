package loopingStatement;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		
		Scanner facto = new Scanner(System.in);
		
		System.out.println(" Enter the number to find the factorial of a number : -     ");
		int  n = facto.nextInt();
	
		// This code is written for printing the numbers starting from 5 to 1
		/*
		int i =5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		*/
		// this code is written for finding the factorial number:--- 
		int k =1 , fact=1;
		while(k<=n) {
			
			fact *=k; // fact *k
			System.out.println(k + "!" + " = "+fact);
			k++;
		}
		

	}

}
