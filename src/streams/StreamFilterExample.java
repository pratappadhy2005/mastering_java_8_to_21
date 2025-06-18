package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static List<Student> filterStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGradeLevel() >= 3.5 && student.getGradeLevel() <= 5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        filterStudents(StudentDataBase.getAllStudents())
                .forEach(student -> System.out.println(student.getName() + " - Grade Level: " + student.getGradeLevel()));

    }
}
