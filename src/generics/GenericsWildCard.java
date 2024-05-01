package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 01-04-2024
 */
public class GenericsWildCard {

    /*
    * As we are using generics it is more type safe.
    * */
    static <T> void printList(List<T> list) {
        for (T obj : list) {
            System.out.println(obj);
        }
    }

    /*
    * Due to wildcard this method will treat items as a Object. Because of this it is
    * very less type safe.
    * */
    static void printListWithWildcard(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        List<String> strings = new ArrayList<>();
        strings.add("Monkey D Luffy");
        strings.add("Nami");

        printList(integerList);
        printListWithWildcard(integerList);

        printList(strings);
        printListWithWildcard(strings);
    }
}
