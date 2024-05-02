package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int salary;
    private String group;

    public Employee() {
    }

    public Employee(String name, int salary, String group) {
        this.name = name;
        this.salary = salary;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return STR."Employee{name='\{name}\{'\''}, salary=\{salary}, group='\{group}\{'\''}\{'}'}";
    }
}

public class GroupByLocation {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Luffy",100,"Monster Trio"),
                new Employee("Zoro",100,"Monster Trio"),
                new Employee("Sanji",100,"Monster Trio"),
                new Employee("Nami",100,"Weak Trio"),
                new Employee("Usopp",100,"Weak Trio"),
                new Employee("Chopper",100,"Weak Trio"),
                new Employee("Robin",100,"Weird Trio"),
                new Employee("Franky",100,"Weird Trio"),
                new Employee("Brooke",100,"Weird Trio"),
                new Employee("Jimbe",100,"Sensible")
        );

        Map<String,List<Employee>> groupEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGroup));

        groupEmployees.forEach((group,members) -> {
            System.out.println(STR."Group: \{group}");
            members.forEach(System.out::println);
            System.out.println();
        });
    }
}
