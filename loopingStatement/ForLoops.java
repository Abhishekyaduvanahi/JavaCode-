package loopingStatement;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		
		
		Scanner userNumber = new Scanner(System.in);
		System.out.println(" Please Enter the number to find the sum of that number ");
		int n = userNumber.nextInt();
		int sum =0;
		for(int k =0; k<=n;k++) {
			sum+=k;
			
		}
		System.out.println("Sum of numbers : " + sum  );
	}

}
   