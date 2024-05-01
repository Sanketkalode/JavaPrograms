package abstraction;

public abstract class BMW {
	
	void commonFunc() {
		System.out.println("Inside common Func method");
	}

	abstract void acceleration();
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
}
