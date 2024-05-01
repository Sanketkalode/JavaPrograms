package generics;

/**
 * @author SanketKalode
 * @date 01-04-2024
 */

class GenericsBox<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
public class Generics_Example1 {

    public static void main(String[] args) {

        GenericsBox<Integer> integerGenericsBox = new GenericsBox<>();

        integerGenericsBox.setObj(1);
        System.out.println(integerGenericsBox.getObj());

        GenericsBox<String> stringGenericsBox = new GenericsBox<>();

        stringGenericsBox.setObj("Hello World");
        System.out.println(stringGenericsBox.getObj());
    }
}
