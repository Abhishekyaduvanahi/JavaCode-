 package inputOutp;
// for taking user input we have to use import java.util.Scanner 
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
    
		//this code is imporrtant remember it for taking user input from keyboard 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter a number ");
		int number = sc.nextInt();
		System.out.println("You entered number is :"+ number);
		// sc.close is used for :-
		sc.close();
	}

}
