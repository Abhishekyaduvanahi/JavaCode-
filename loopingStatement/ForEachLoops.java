package loopingStatement;

public class ForEachLoops {

	public static void main(String[] args) {
	
		/*
		char[] letters = {'a','b','h','i','y','d','v'};
		for(int i =0;i<letters.length; i++) {
			
			System.out.print(letters[i]);
		}
		
		*/
		
		
		// using for each loops 
		
	/*
		
		char[] letter = {'a','b','h','i','y','d','v'};
		for(char item : letter) {
			System.out.print(item);
		}

		*/
		
		
		int[] numbers = {6,4,5,6};
		int sum =0;
		for(int num : numbers ) {
			sum+=num;
			System.out.println(num);
			
		}
		
	System.out.println(" Sum of numbers : " + sum );
		
	}

}
