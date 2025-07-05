package find;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class FindFirstAndAnyExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> anyStudent = findAnyStudent();
        anyStudent.ifPresent(student ->
            System.out.println("Found any student: " + student));

        Optional<Student> firstStudent = findFirstStudent();
        firstStudent.ifPresent(student ->
            System.out.println("Found first student: " + student));
    }
}
