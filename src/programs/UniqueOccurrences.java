package programs;

import java.util.*;

/**
 * @author SanketKalode
 * @date 27-03-2024
 */
public class UniqueOccurrences {

    static boolean uniqueOccurrences(int[] arr){


        Map<Integer,Integer> values = new HashMap<>();

        for (int i: arr){
            if (values.containsKey(i)){
                values.put(i,values.get(i)+1);
            }
            else{
                values.put(i,1);
            }
        }

        List<Integer> list = new ArrayList<>();

        boolean flag = true;

        for (int i: values.keySet()){
            if (list.contains(values.get(i))){
                flag = false;
                break;
            }
            else {
                list.add(values.get(i));
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
