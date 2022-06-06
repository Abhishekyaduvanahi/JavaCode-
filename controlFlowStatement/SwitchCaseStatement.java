package controlFlowStatement;

import java.util.Scanner;
// Switch Case Statement ,it will execute one statement from multiple conditions
public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println(" Please Enter a day of number of weak : ");
		
		int dayNumber = number.nextInt();
		
		String day;
		switch(dayNumber) {
		
		case 1:
			day = "MONDAY";
			break;
		case 2:
			day ="Tuesday";
			break;
		case 3:
			day ="Wednesday";
			break;
		case 4:
			day ="Thursday";
			break ;
		case 5:
			day= "Friday ";
			break;
		case 6:
			day ="Saturday";
			break;
		case 7:
			day ="Sunday ";
			break;
			default :
			day = "Invalid Day Dear ";
			break;
		
		
		}
		
System.out.println(day);
	}

}
