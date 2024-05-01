package inheritance;

import java.io.IOException;

/**
 * @author SanketKalode
 * @date 02-04-2024
 */

class Parent{
    void testMethod(){
        System.out.println("Hello");
    }
}

class Child extends Parent implements Cloneable{

    private String value;

    public Child(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    void testMethod(){
        System.out.println("Goodbye!!");
    }

    @Override
    public Child clone() {
        try {
            return (Child) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Child child = new Child("child");
        Child child1 = child.clone();
        System.out.println(child1.getValue());
        System.out.println(child.getValue());
        child1.setValue("child1");

        System.out.println(child1.getValue());
        System.out.println(child.getValue());

    }
}
