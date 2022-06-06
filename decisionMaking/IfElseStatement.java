package decisionMaking;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		
		
		Scanner EnterNumber = new Scanner(System.in);
		
        System.out.println(" Enter the number to check whether the given code is even or odd :-");
       
       int number = EnterNumber.nextInt();
       
       if(number %2 ==0) {
    	   System.out.println("Your Entered Number is :- "+number);
    	   System.out.print("& Entered Number is Even ");
       }
       else {
    	   System.out.println("Your Entered Number is :- "+number);
    	   System.out.print("&  Entered number is not Even");
       }
       
       EnterNumber.close();

	}

}
