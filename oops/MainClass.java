 
// These code for learning the concept of class and object
package oops;

//created a class 
class Cat{
	boolean hasfur;
	String color,breed;
	int legs,eyes;
	// created methods walk 
	public void walk() {
		System.out.println("Cat is walking ");
	}
	// creating methods for eat
	public void eat() {
		System.out.println("Cat is eating");
	}
	// for accessing behaviour use description
	public void description() {
		System.out.println("my cat has "+ legs +" legs and "+eyes+" eyes ");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// created object 
		// object creating syntax is classaName objName = new Class name ();
		
		Cat jully = new Cat();
		Cat baby = new Cat();
		
		
		// defining the value legs and eyes 
		
		jully.legs= 4;
		baby.eyes= 2;
		jully.eyes= 2;
		baby.legs= 4;
		
		
		// use . for accessing any function 
		jully.description();
		baby.description();
		
	}

}
