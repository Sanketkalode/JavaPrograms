package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int salary;
    private String group;
    private String email;

    public Employee(String name, int salary, String group, String email) {
        this.name = name;
        this.salary = salary;
        this.group = group;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return STR."Employee{name='\{name}\{'\''}, salary=\{salary}, group='\{group}\{'\''}, email='\{email}\{'\''}\{'}'}";
    }
}

public class GroupByLocation {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Luffy",100,"Monster Trio","luffy@strawhats.com"),
                new Employee("Zoro",100,"Monster Trio","zoro@strawhats.com"),
                new Employee("Sanji",100,"Monster Trio","sanji@strawhats.com"),
                new Employee("Nami",100,"Weak Trio","nami@strawhats.com"),
                new Employee("Usopp",100,"Weak Trio","usopp@strawhats.com"),
                new Employee("Chopper",100,"Weak Trio","chopper@strawhats.com"),
                new Employee("Robin",100,"Weird Trio","robin@strawhats.com"),
                new Employee("Franky",100,"Weird Trio","franky@strawhats.com"),
                new Employee("Brooke",100,"Weird Trio","brooke@strawhats.com"),
                new Employee("Jimbe",100,"Sensible","jimbe@strawhats.com"),
                new Employee("strawhat",100,"Sensible","luffy@strawhats.com"),
                new Employee("cat burglar",100,"Sensible","nami@strawhats.com")
        );

        /*
        * Group employees by group
        * */

        Map<String,List<Employee>> groupEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGroup));

        groupEmployees.forEach((group,members) -> {
            System.out.println(STR."Group: \{group}");
            members.forEach(System.out::println);
            System.out.println();
        });

        /*
        * Find unique email addresses.
        * */

        System.out.println(employees.stream().map(Employee::getEmail).collect(Collectors.toSet()));
    }
}
