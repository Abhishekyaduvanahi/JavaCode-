package operators;

public class ConditionalOperators {
	
	/*
	 && --> Conditional AND operators
	         (Conditional AND operator will give true if the value of both operand is true   )
	 || --> Conditional OR  operators 
	        (Conditional OR operators will give true if the value of any one operand is false )
	 ?: --> Ternary operator 
	        ( Its widely used in Control flow statements i.e. in if else statement )
	 
	 
	 
	 */

	public static void main(String[] args) {
		
		
		int number1 = 5, number2 = 8, number3 = 12 ;
		
		boolean result;
		
		// Conditional AND Operator (&&)
		
		result = (number1>number2 )&&( number3>number1);
		System.out.println(" Condtional AND Operators      :-  " +result);
		
		// Conditional OR Operators (||)
		result = (number1>number2 )||( number3>number1);
		System.out.println(" Conditional OR Operator result :-  " +result);
		
		// Ternary Operator (?)
		
		result = number1<number2 ? true: false ;
		System.out.println(" Ternary Operator Result        :- "+result );

	}

}
