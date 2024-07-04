package programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 18-06-2024
 */
public class EvenDigits {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ints = {3,11,4,200};
        System.out.println(sol.getEvenDigitNumbers(ints));

    }
}

class Solution {
    List<Integer> getEvenDigitNumbers (int[] arr) {
        // add your logic here
        List<Integer> ints = new ArrayList<>();

        for (int i =0;i<arr.length;i++){
            int d = arr[i];
            List<Integer> values = new ArrayList<>();
            while(d != 0){
                values.add(d % 10);
                d = d/10;
            }
            if(values.size() %2 == 0){
                ints.add(arr[i]);
            }
        }
        return ints;
    }
}