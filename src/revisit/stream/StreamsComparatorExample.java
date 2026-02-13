package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> studentList = sortStudentByName();

        System.out.println("Students sorted by name: ");
        studentList.forEach(System.out::println);

        List<Student> studentList1 = sortStudentByGpa();
        System.out.println("\nStudents sorted by GPA: ");
        studentList1.forEach(System.out::println);

    }
}
