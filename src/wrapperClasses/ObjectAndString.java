package wrapperClasses;

public class ObjectAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long x = 1000;
		
		Long y = Long.valueOf(x);
		
		System.out.println(y.toString());
		
		System.out.println(Long.valueOf(y.toString()));

	}

}
