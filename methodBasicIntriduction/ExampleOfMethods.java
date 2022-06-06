package methodBasicIntriduction;

import java.util.Scanner;

public class ExampleOfMethods {

	public static void main(String[] args) {
  
		Scanner number1 = new Scanner(System.in);
		System.out.println(" ** Enter the first number ** ");
		int num1 = number1.nextInt();
		
		Scanner number2 = new Scanner(System.in);
		System.out.println( " ** Enter the second number ** ");
		int num2 = number2.nextInt();
		
		show(num1,num2);
		add(num1,num2);
		min(num1,num2);
		
	}
    // code for displaying numbers 
	
	public static void show(int num1,int num2) {
		System.out.println("You entered : " + num1 + " and " + num2 );
	}
	
	// returns the sum of two numbers .
	
	public static void add(int num1,int num2) {
		int sum =0;
		sum = num1 + num2;
	  System.out.println("The sum of two number which you entered :- "+sum);
	}
	
	// return the minimum of two numbers 
	
	public static void  min(int num1,int num2) {
		
		int min ;
		if(num1>num2)
			min =num2;
		else
			min = num1;
		System.out.println("Minimum of the number which you entered :- "+min);
	}
}
