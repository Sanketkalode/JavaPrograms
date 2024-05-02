package garbageCollection;

public class GarbageCollectionExample {
    public static void main(String[] args) {

        GarbageCollectionExample gc = new GarbageCollectionExample();
        gc = null;

        System.gc();    // Garbage collection.

        Runtime.getRuntime().gc();  // Same as System.gc() method.
    }

}
