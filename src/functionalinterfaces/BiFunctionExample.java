package functionalinterfaces;

import data.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentFunction = (students, predicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (predicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradeMap;
    };
    public static void main(String[] args) {
        System.out.println(BiFunctionExample.add.apply(5, 10)); // Output: 15
        System.out.println(studentFunction.apply(
            data.StudentDataBase.getAllStudents(),
            PredicateStudentExample.p1
        )); // Output: Map of student names and GPAs based on the predicate
    }
}
