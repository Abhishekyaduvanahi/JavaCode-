/*
 = this is a simple assignment operators 
 += this is add and assignment operators 
 -= this is subtract and assignment operators 
 *= this is multiply and assignment operators
 /= this is divide and assignment operators 
  %= this is modulus and assignment operators 
 
 */


package operators;

public class AssingmentOperators {

	public static void main(String[] args) {
		
		
		int x=20,y=15,z=0;
		
		z= x+y;
		System.out.println(" z = x + y isEqualTo "+z);
		
		z+=x;// z=z+x
		System.out.println("z+=x isEqualTo "+z);
		
		z-=x;    // z=z-x
		System.out.println("z+=x isEqualTo  "+z);
		
		z*=x;    // z=z*x
		System.out.println("z*=x  isEqualTo "+z);
		
		z/=x;     //z=z/x
		System.out.println("z/=x  isEqualTo "+z);
		
		z%=x;    // z%=x
		System.out.println("z%=x  isEqualTo "+z);
		
		

	}

}
