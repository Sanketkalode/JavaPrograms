package assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "hello";

		char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();
        
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        
        boolean flag = true;
        
        if (aArray.length == bArray.length) {
        	for (int i = 0;i<aArray.length;i++) {
                if (aArray[i] != bArray[i]) {
                    flag = false;
                    break;
                }
        	}
        }
        else {
        	flag = false;
        }
        
        System.out.println(flag);
	}

}
