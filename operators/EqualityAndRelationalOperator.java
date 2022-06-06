package operators;

import java.util.Scanner;

/*
   Operators   ' Their functionality
               '
     ==        '  Equal to 
     !=        '  Not equal to 
     >         '  Greater than 
     <         '  Less than 
              
   
   Equality and Relational Operator mostly returns Boolean value 
   
   
 */
public class EqualityAndRelationalOperator {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.println("Assigned the value of a :- ");
		int a = number.nextInt();
		System.out.println("Assigned the value of b :- ");
		int b = number.nextInt();
		System.out.println("a == b :"+ (a==b));
		System.out.println("a != b :" +(a!=b));
		System.out.println("a > b  :"+ (a>b));
		System.out.println("a < b  :" +(a<b));
		

	}

}
