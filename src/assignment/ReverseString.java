package assignment;

/**
 * @author SanketKalode
 * @date 27-04-2024
 */
public class ReverseString {

    static String reverseStringTwoPointer(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    static String reverseString(String str) {
        String reversed = "";
        char[] arr = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(arr[i]));
        }
        return reversed;
    }


    public static void main(String[] args) {

        System.out.println(reverseStringTwoPointer("Hello World"));
        System.out.println(reverseString("Hello World"));
    }
}
