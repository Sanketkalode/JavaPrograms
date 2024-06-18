package questions;

/**
 * @author SanketKalode
 * @date 07-06-2024
 */
public class SingletonClass {
    public static void main(String[] args) {
        SingletonExample obj = SingletonExample.getInstance();
        obj.print();
        System.out.println(obj.hashCode());

        SingletonExample obj1 = SingletonExample.getInstance();
        System.out.println(
                obj1.hashCode()
        );
        System.out.println(obj.equals(obj1));
    }
}

class SingletonExample {
    private static SingletonExample obj;

    private SingletonExample() {
    }

/*    synchronized public static SingletonExample getInstance() {
        if (obj == null) {
            return new SingletonExample();
        }
        return obj;
    }*/

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            if (obj == null) {
                return new SingletonExample();
            }
        }
        return obj;
    }

    void print() {
        System.out.println("Print from singleton object");
    }
}
