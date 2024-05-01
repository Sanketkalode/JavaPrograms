package staticPrograms;

/**
 * @author SanketKalode
 * @date 07-04-2024
 */

class Exampleclass{
    private static int i;

    static void counter(){
        i = i++;
    }

    void increaseCount(){
        Exampleclass.counter();
    }

    void printCount(){
        System.out.println(Exampleclass.i);
    }
}

public class StaticExample5 {
    public static void main(String[] args) {
        Exampleclass ex1 = new Exampleclass();
        Exampleclass ex2 = new Exampleclass();

        ex1.increaseCount();
        ex2.increaseCount();
        ex1.printCount();
        ex1.increaseCount();
        ex2.printCount();
    }
}
