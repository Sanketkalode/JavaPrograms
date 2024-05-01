package biFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */
public class BiFunctionExample2 {
    public static void main(String[] args) {

        BiFunction<Integer, String, Employee> createObject = (id, name) -> new Employee(id, name);

        List<Employee> employees = new ArrayList<>();

        Employee emp = createObject.apply(1,"Monkey D Luffy");
        System.out.println(emp);

        employees.add(emp);
        employees.add(createObject.apply(2,"Zoro"));
        employees.add(createObject.apply(3,"Nami"));
        employees.add(createObject.apply(4,"Ussopp"));

        System.out.println(employees);

    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."Employee{id=\{id}, name='\{name}\{'\''}\{'}'}";
    }
}
