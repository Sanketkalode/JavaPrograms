package questions;

/**
 * @author SanketKalode
 * @date 07-06-2024
 */
public class StringConstantPool {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = new String("Java");
        String str2 = "Java".intern();
        String str3 = "Java";

        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str1 == str2);
    }
}
