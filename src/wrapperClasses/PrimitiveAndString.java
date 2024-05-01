package wrapperClasses;

public class PrimitiveAndString {
	
	public static void main(String[] args) {
		byte x = 100;
		
		String s = Byte.toString(x);
		
		System.out.println(s);
		
		System.out.println(Byte.parseByte(s));
	}

}
