package programs;

import java.util.Objects;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		StringBuilder sb = new StringBuilder(a);
		
		System.out.println(a.hashCode());
		System.out.println(sb.hashCode());
		
		System.out.println(Objects.hash(a,sb));

	}

	
}
