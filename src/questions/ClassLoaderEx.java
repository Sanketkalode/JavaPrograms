package questions;

import java.sql.DriverManager;
import java.util.ArrayList;

public class ClassLoaderEx {
    public static void main(String[] args) {
        System.out.println(ArrayList.class.getClassLoader());
        System.out.println(DriverManager.class.getClassLoader());
        System.out.println(ClassLoaderEx.class.getClassLoader());
    }
}
