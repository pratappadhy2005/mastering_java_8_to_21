package revisit.functionalinterfaces;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Student>, Predicate<Integer>, Map<Student, Integer>> biFunction = (StudentList, gradePredicate) -> {
        return StudentList.stream()
                .filter(student -> gradePredicate.test(student.getGradeLevel()))
                .collect(java.util.stream.Collectors.toMap(student -> student, student -> student.getGradeLevel()));
    };

    static Predicate<Integer> predicate = gradeLevel -> gradeLevel >= 3;

    public static void main(String[] args) {
        Map<Student, Integer> studentIntegerMap = biFunction.apply(StudentDataBase.getAllStudents(), predicate);
        System.out.println(studentIntegerMap);
    }
}
