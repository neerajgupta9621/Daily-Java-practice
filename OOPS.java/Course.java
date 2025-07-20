class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments = 2;
        enrollments++;
        System.out.println(enrollments);
    }

    void unenrollStudent(String studentName) {
        enrollments = 2;
        enrollments--;
        System.out.println("Student rremoved  and Enrollments = " + enrollments);
    }
}

class Main {
    public static void main(String[] args) {
        Course obj = new Course("BCA");
        obj.setMaxCapacity(2);
        obj.enrollStudent("neeraj");
        obj.unenrollStudent("Mala");
    }
}