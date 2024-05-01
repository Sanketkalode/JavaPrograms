package nonStaticPrograms;

public class ThisKeywordDemo {

	int x;
	
	public ThisKeywordDemo() {
		// TODO Auto-generated constructor stub
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}
	
}
