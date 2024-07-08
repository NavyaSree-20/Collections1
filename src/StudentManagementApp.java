package src;

import java.util.List;
import java.util.ArrayList;
public class StudentManagementApp {
    private List<Student> studentList;

    public StudentManagementApp() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student searchStudentById(String id) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                return student;
            }
        }
        return null; // Return null if student with given ID is not found
    }

    public void displayStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        app.addStudent(new Student("S001", "Priya"));
        app.addStudent(new Student("S002", "Bobby"));
        app.addStudent(new Student("S003", "Charlie"));
        String searchId = "S003";
        System.out.println("Searching for student with ID " + searchId + ":");
        Student foundStudent = app.searchStudentById(searchId);
        if (foundStudent != null) {
            System.out.println("Student found " + foundStudent);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");

        }
    }
}