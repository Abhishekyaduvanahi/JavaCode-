package methodBasicIntriduction;

/*
   --> In method overloading a same name of method is created but its have different parameters
   as mentioned in the code .
 */
//import java.util.Scanner;


public class MethodOverloading {

	public static void main(String[] args) {
		
		
		System.out.println("Sum of two numbers : "+ add(10,20));
		System.out.println("Sum of three  numbers : "+ add(10,20,30));
		System.out.println("Sum of two double numbers : "+ add(10,20));

	}
	
	public static int add(int x ,int y ) {
		return x+y;
		
	}
	public static int add(int x,int y, int z) {
		
		return x+y+z;
		
	}
    public static double add(double x, double y) {
    	return x+y;
    }
}
