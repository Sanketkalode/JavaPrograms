package records;

record Address(String street, String city, String state){}

record Employee(Long id, String name, Address address){}

public class RecordExample2 {
    public static void main(String[] args) {
        Employee employee = new Employee(1L, "John", new Address("5th Street", "NewYork","NewYork"));

        System.out.println(employee);
    }
}
