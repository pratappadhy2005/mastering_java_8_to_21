package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;

        // student name and their activities
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                //.stream()
                .parallelStream()
                .filter(studentPredicate) // Filter students in grade 3 or higher
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));

        System.out.println(studentMap);
    }
}
