package in.Challenge114;

import java.util.List;
import java.util.stream.Collectors;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employee = List.of(
                new Employee("Neeraj", 50000),
                new Employee("Nikhil", 40000),
                new Employee("Mala", 30000),
                new Employee("Satyam", 20000),
                new Employee("Pradeep", 60000),
                new Employee("Alok", 70000),
                new Employee("Sumit", 80000));

        employee.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
