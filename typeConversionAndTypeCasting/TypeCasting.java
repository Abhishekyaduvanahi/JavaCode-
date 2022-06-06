/*
 TypeCasting is done When you assign a value of larger dataType into a smaller DataType.
 */

package typeConversionAndTypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		double s = 86.02;
		// here we did type casting and we assigned double dataType value in long dataType
		long m =(long)s;
		
		// here we converting long value in byte 
		byte c = (byte)m;
		
		// printing the value of double 
		System.out.println(s);
		
		
		// 
		
		System.out.println("printing the value of long "+m);
		
		// printing the value of byte 
		
		
		System.out.println("printing the value of byte " + c);
		
		
		
		

	}

}
