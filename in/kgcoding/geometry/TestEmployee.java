package in.kgcoding.geometry;

public class TestEmployee {
public static void main(String[] args) {
    Employee emp = new Employee("Neeraj", 19, 25000);
    System.out.println(emp.getEmployeeDetails());
    emp.setName("Golu");
    System.out.println(emp.getEmployeeDetails());
}
}
