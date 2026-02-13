package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;

public class FilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents()
                .stream()
                .peek((s) -> System.out.println("Before Filter: " + s))
                .filter(student -> student.getGradeLevel() >= 3)
                .peek((s) -> System.out.println("After Grade Level Filter: " + s))
                .collect(java.util.stream.Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> studentList = filterStudents();
//        studentList.forEach(System.out::println);
    }
}
