package comparatorComparable.comparator;

import java.util.Comparator;

/**
 * @author SanketKalode
 * @date 29-03-2024
 */
public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return -1;
    }
}
