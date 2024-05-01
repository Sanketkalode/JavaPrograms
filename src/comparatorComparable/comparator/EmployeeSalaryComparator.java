package comparatorComparable.comparator;

import java.util.Comparator;

/**
 * @author SanketKalode
 * @date 26-04-2024
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
