class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }
}

class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Grade: " + student.getGrade());
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudentDetails(String name, int id, double grade) {
        model = new Student(name, id, grade);
    }

    public void displayStudentDetails() {
        view.displayStudentDetails(model);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 123, 85.5);

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(student, studentView);

        studentController.displayStudentDetails();

        studentController.updateStudentDetails("Bob", 456, 92.0);

        studentController.displayStudentDetails();
    }
}
