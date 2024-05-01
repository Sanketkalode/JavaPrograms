package comparatorComparable.comparator;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * @author SanketKalode
 * @date 29-03-2024
 */
public class Employee {
    private int empId;
    private String name;
    private BigDecimal salary;
    private int age;

    public Employee(int empId, String name, BigDecimal salary, int age) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return STR."Employee{empId=\{empId}, name='\{name}\{'\''}, salary=\{salary}, age=\{age}\{'}'}";
    }
}
