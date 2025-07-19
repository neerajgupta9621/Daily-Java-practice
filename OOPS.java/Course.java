class Course {
    String courseName, enrolledStudents;
    private String studentName;
    static int maxCapacity;

    public void setEnrolledStudent(String studentName) {
        studentName = studentName;
    }

    public void setUnenrollStudent(String studentName) {
        studentName = studentName;
    }

    public static void setSetMaxCapacity(int capacity) {
        capacity = capacity;
    }

    public void getEnrolledStudent() {
        System.out.println(studentName + "studentName");
    }

    public void getUnenrollStudent() {
        System.out.println("Student Name" + studentName);
    }

    public void getSetMaxCapacity() {
        System.out.println("Max Capacity " + maxCapacity);
    }
}

class Main {
    public static void main(String[] args) {
        Course obj = new Course();
        obj.setEnrolledStudent("Neeraj");
        obj.setUnenrollStudent("Mala");
        obj.setSetMaxCapacity(4);
        obj.getEnrolledStudent();
        obj.getUnenrollStudent();
        obj.getSetMaxCapacity();
    }
}
