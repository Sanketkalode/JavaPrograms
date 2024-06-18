package questions;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author SanketKalode
 * @date 13-06-2024
 */
public class HashcodeEqualsContract {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"abc",23,12234L);
        Employee emp2 = new Employee(1,"abc",23,12234L);
        Employee emp3 = new Employee(2,"prq",23,12234L);

        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println(employees);
        System.out.println(STR."\{emp1.hashCode()}  \{emp2.hashCode()} \{emp3.hashCode()}");
    }
}

class Employee{
    private int id;
    private String name;
    private int age;
    private Long salary;

    public Employee(int id, String name, int age, Long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return STR."Employee{id=\{id}, name='\{name}\{'\''}, age=\{age}, salary=\{salary}\{'}'}";
    }
}
