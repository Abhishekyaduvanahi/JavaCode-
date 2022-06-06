 package controlFlowStatement;

import java.util.Scanner;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		System.out.print("Please Enter your age :- ");
		int yourAge = age.nextInt();
		
		if(yourAge <13) {
			System.out.println("Your entered age is :-"+yourAge);
			System.out.print(" as per your entered age you are a child. ");
		}
		
		else if (yourAge <19) {
			System.out.println("Your entered age is :-"+yourAge);
			System.out.print(" as per your entered age you are a teenager  . ");
		}
		else {
			
			if(yourAge<65) {
				System.out.println("Your entered age is :-"+yourAge);
				System.out.print(" as per your entered age you are an Adult . ");
				
			}
			else if(yourAge<150) {
				System.out.println("Your entered age is :-"+yourAge);
				System.out.print(" as per your entered age you are a Senior . ");
				
			}
			else {
				System.out.println("You are a history ,' *Dadu* ',");
			}
		}
		
		
		
		
		

	}

}
