package questions;

/**
 * @author SanketKalode
 * @date 03-06-2024
 */

class A{
    public static void print(){
        System.out.println("Print from A");
    }

    public static void print(String a){
        System.out.println(a);
    }


    void print2(){
        System.out.println("Print from instance method from A");
    }
}

class B extends A{
    public static void print(){
        System.out.println("Print from B");
    }
    void print2(){
        System.out.println("Print from instance method from B");
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        /*
        * Que: Can we override a static method in Java?
        * */

        B b = new B();
        b.print2();
        A.print();
        B.print();
        A.print("Hello World");

    }
}


