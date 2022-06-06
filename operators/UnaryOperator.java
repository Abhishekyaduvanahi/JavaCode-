package operators;

  /*
     +  It is Unary plus Operator 
     - It is Unary minus Operator 
     ++ It is Increment Operator its increase the value by one 
     -- It is decrement Operator its decreases the value by one 
     !  It is logical Complement Operator 
      
    
   */
   



public class UnaryOperator {

	public static void main(String[] args) {
		
		double number = 7.6;
		boolean isRight = true ;
		
		System.out.println("+ number = " + +number  );
		System.out.println("- number = " + -number  );
		System.out.println("++ number = " + ++number  );
		System.out.println("-- number = " + --number  );
		System.out.println("! isRight = " + !isRight  );
		
		
		System.out.println(" -------------------------- "  );
		double result = 4.7;
		
		 // this code will firstly print the value of result then it will incremet the value by 1
		
		System.out.println(result++);
		
		// this line of code will print the incremented value of code 
		// because in previous line of code the value is incremented by 1 
		
		
		System.out.println(result);
		
		// this code will firstly increment the value of result and then incremented value will be printed 
	
		System.out.println(++result);
		
		// this code will print the previous incremented value 
	
		
		System.out.println(result);
		
		
	
	}

}
