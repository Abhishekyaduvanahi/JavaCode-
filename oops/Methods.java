//  method is for used when a piece of code is used many places 


package oops;

public class Methods {

	public static void main(String[] args) {
		
	
		
		int firstNumber = 34;
		int secondNumber = 45;
		
		// Calling of the function greet() and maxOf()
		 
		greet();
		
		int result = maxOf(firstNumber,secondNumber);
		System.out.println("maxOf above two number is :- ");
		System.out.println(result);
		

	}
	// created methods whose return type is int and parameter passed are a and b 
	static int maxOf(int a ,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
		
		}
	
// created greet methods whose parameter is void 
	static  void greet() {
			System.out.println("Hello Mr. Abhishek ");
	}

}
