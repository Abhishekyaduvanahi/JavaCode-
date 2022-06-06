package controlFlowStatement;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.println(" Please enter 3 number  ");
		
		int number1 ,number2,number3,largestNumber;
		number1 = number.nextInt();
		number2 = number.nextInt();
		number3 = number.nextInt();
		
	if((number1>number2)&& (number1>number3)){
		largestNumber =number1;

		System.out.println("Largest Number is:- "+largestNumber);
	}
	else if ((number2>number1)&& (number2>number3)) {
		largestNumber =number2;

		System.out.println("Largest Number is:- "+largestNumber);
	}
	else if ((number3>number1)&& (number3>number2)) {
		largestNumber =number3;

		System.out.println("Largest Number is:- "+largestNumber);
	}
	else {
		System.out.println("Entered numbers are equal ");
	}
		
	}

}
