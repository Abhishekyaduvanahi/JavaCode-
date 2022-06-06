package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("......Calculator ..........");
		System.out.println("Please Enter two number ");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.println(" Choose an operations (+,-,*,/,%) :  ");
		char operator = input.next().charAt(0);
		double result = 0.0;
		
		
		switch(operator) {
		case '+' :
			result = number1+number2;
			break;
		case '-' :
			result = number1-number2;
			break;
		case '*' :
			result = number1*number2;
			break;
		case '/' :
			result = number1/number2;
			break;
		case '%' :
			result = number1%number2;
			break;
			default :
			System.out.println("Entered a wrong operators please enter right operator ");
		}
		
		// this line of code will show you the right code :- 
		
		System.out.println(number1 +" "+ operator + ""+number2 +" = " + result);

	}

}
