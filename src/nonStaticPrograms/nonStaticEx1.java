package nonStaticPrograms;

public class nonStaticEx1 {

	int num;

	public nonStaticEx1() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}

	{
		System.out.println("Non static block");
	}

	public static void main(String[] args) {
		System.out.println("Main method.");

		nonStaticEx1 obj= new nonStaticEx1();
		obj.doSomething();
	}

	static {
		System.out.println("Static block");
	}
	
	void doSomething() {
		System.out.println("Do Something");
	}
}
