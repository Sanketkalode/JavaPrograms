package comparatorComparable.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 29-03-2024
 */
public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"abc",new BigDecimal("299998.34"),23);
        Employee e2 = new Employee(56,"erc",new BigDecimal("7524998.34"),21);
        Employee e3 = new Employee(3,"xyz",new BigDecimal("9645798.34"),25);


        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employees.sort(new EmployeeIdComparator());

        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println("---------------------------------------");

        employees.sort(new EmployeeAgeComparator());

        for (Employee employee:employees){
            System.out.println(employee);
        }

        System.out.println("---------------------------------------");

        employees.sort(new EmployeeSalaryComparator());

        for (Employee employee:employees){
            System.out.println(employee);
        }
    }
}
