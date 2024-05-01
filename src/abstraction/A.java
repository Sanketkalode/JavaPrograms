/*
 * Example of final keyword
 * 
 * Here class marked as final can not be inherited i.e. other classes can extends this class
 * 
 * A variable defined as final, then its value cannot be changed.
 * 
 * An object defined as final then its reference cannot be changed.
 * 
 * When a method is defined as a final then it cannot be overridden.
 */

package abstraction;

public final class A {

	final static float pi = 3.14f;
	
	
	public static void main(String[] args) {

		final A a = new A();
		
		System.out.println(a.pi);
		System.out.println(A.pi);
	}

}
