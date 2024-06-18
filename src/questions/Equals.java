package questions;

/**
 * @author SanketKalode
 * @date 04-06-2024
 */
public class Equals {
    public static void main(String[] args) {
        /*
        * Que: .equals() vs == ?
        * Ans: .equals() matches the characters of the two strings. While == checks the memory location
        * of these 2 strings. == is used for address comparison while .equals() is used for
        * content comparison.
        * */


        String a = "a";
        String b = "a";
        String c = new String("a");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
