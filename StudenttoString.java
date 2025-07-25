class Student {

    String name;
    int age;
    int rollno;

    public Student(String name, int age, int rollno) {

        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student Details: [name = " + name + ", age = " + age + ", rollno = " + rollno + "]";
    }

    public static void main(String[] args) {
        Student stu = new Student("Monika", 20, 102);
        System.out.println(stu);

    }
}
