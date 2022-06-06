package controlFlowStatement;


// break ===> terminates loop or switch statements 

// continue ===> Continues the loop but did not execute the code at given condition 


// return ===> exists from the current method ,and control flow returns to where the method was invoked.


// **** BREAK CAN NOT BE USED OUTSIDE OF A LOOP OR SWITCH 

public class BreakContinueReturn {

	public static void main(String[] args) {
		
		
		/*
		for(int i =0; i<10;i++) {
			if(i==7) 
				break;
			System.out.println(i);
				
			*/
		
		
		int a =0;
		switch(a) {
		
		case 0 :
			System.out.println(" Hi! ");
			break;
		case 1:
			System.out.println("Hello !");
			break;
		
		}

	}

}
