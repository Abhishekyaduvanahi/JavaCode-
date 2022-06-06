package fibbonacciProject;

import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter an Integer base number : ");
		int base = input.nextInt();
		System.out.println(" Enter exponent : ");
		int exponent = input.nextInt();
		
		
		for (int i =0; i<= exponent ;i++) {
			System.out.println(base + " to the number " + i + " is :" +pow(base,i) );
		}
		input.close();

	}
	public static int pow (int num ,int power) {
		return (int) Math.pow(num,power);
	}

}
