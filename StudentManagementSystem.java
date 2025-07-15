import java.sql.*;
import java.util.Scanner;

public class StudentManagementSystem {

    static final String DB_URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root"; // ← apna DB username daalo
    static final String PASS = "password"; // ← apna DB password daalo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            do {
                System.out.println("\n===== Student Management Menu =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Delete Student");
                System.out.println("5. Update Student");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> addStudent(sc, conn);
                    case 2 -> viewAllStudents(conn);
                    case 3 -> searchStudent(sc, conn);
                    case 4 -> deleteStudent(sc, conn);
                    case 5 -> updateStudent(sc, conn);
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid Choice!");
                }
            } while (choice != 0);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addStudent(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter course: ");
        sc.nextLine();
        String course = sc.nextLine();

        String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, course);
            stmt.executeUpdate();
            System.out.println("Student added successfully.");
        }
    }

    static void viewAllStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- All Students ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Course: " + rs.getString("course"));
            }
        }
    }

    static void searchStudent(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        String sql = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Course: " + rs.getString("course"));
            } else {
                System.out.println("Student not found.");
            }
        }
    }

    static void deleteStudent(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }

    static void updateStudent(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        String sql = "UPDATE students SET name=?, age=?, course=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, course);
            stmt.setInt(4, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }
}