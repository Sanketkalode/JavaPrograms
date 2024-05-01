package staticPrograms;

public class StaticExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!!!!!!!");
		StaticExample3.method1();
	}
	
	static void method1() {
		System.out.println("Hello from static method");
	}
	
	static {
		System.out.println("Hello from staic block");
	}
}
