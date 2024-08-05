package questions;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading ab = new MethodOverloading();

//        ab.add(1,2); For this compilation error will be thrown.

        ab.add(1F, 2.0);
    }

    void add(float a, double b){
        System.out.println("method 1");
        System.out.println(a+b);
    }

    void add(double a, float b){
        System.out.println("method 2");
        System.out.println(a+b);
    }
}
