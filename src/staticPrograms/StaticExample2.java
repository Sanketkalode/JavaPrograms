package staticPrograms;

public class StaticExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	static {
		System.out.println("Hello from static 1");
	}
	
	static {
		System.out.println("Hello from static 2");
	}

}
