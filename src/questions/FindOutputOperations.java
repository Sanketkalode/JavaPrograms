package questions;

import java.util.Arrays;

/**
 * @author SanketKalode
 * @date 13-06-2024
 */
public class FindOutputOperations {
    public static void main(String[] args) {
        System.out.println(0.1*3 /*== 0.3*/);
        System.out.println(0.1*2 /*== 0.2*/);

        System.out.println(1.0/0.0);

        String str = new String("abc");
        String string = "abc";

        System.out.println(str == string);
        System.out.println(str.equals(string));

        Integer num1 = 1000, num2 = 1000;
        System.out.println(num1 == num2);//1
        Integer num3 = 20, num4 = 20;
        System.out.println(num3 == num4);//2
        System.out.println(num3);
        System.out.println(num4);

        String name = "Sanket";
        System.out.println(Arrays.toString(name.getBytes()));

        Thread s = Thread.currentThread();
        System.out.println(s.isAlive());
    }

}
