package in.Challenge114;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {
    public static void main(String[] args) {
        List<Integer> salary = List.of(30000, 40000, 20000, 23000, 70000, 80000);
        List<Integer> numbers = salary.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Before Employee Salary: " + salary);
        System.out.println("After Employee Salary: " + numbers);
    }
}
