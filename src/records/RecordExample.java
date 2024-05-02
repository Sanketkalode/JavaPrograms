package records;

record Student(int id, String name){}

/*
* Record *  is the immutable data object which has some data.
* Using record we can reduce writing some boiler plate code.
* Due to this we don't have to write constructors, getters, toString() method etc,
* as it creates those methods while compiling.
*
* As record objects are immutable setters methods of these objects are not available.
* */

public class RecordExample {
    public static void main(String[] args) {
        Student st = new Student(1,"abc");
        System.out.println(st);
    }
}
