package comparator;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static List<Student> sortStudentsByName(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        return sortedStudents;
    }

    public static List<Student> sortStudentsByGpa(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
        return sortedStudents;
    }

    public static void main(String[] args) {
        List<Student> sortedStudents = sortStudentsByName();
        System.out.println("Students sorted by name:");
        sortedStudents.forEach(System.out::println);
        System.out.println("Studets sorted by GPA:");
        List<Student> sortedStudentsByGpa = sortStudentsByGpa();
        sortedStudentsByGpa.forEach(System.out::println);
    }
}
