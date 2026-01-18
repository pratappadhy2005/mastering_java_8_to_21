package revisit.functionalinterfaces;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {

    static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.5;
    static Function<List<Student>, Map<String, Double>> studentNameAndGpaFunction = students -> {
        // Implement the logic to convert List<Student> to Map<String, Double>
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.stream()
                .filter(gpaPredicate)
                .forEach(student -> {
            // Logic to populate the map with student names and their GPA
            studentGradeMap.put(student.getName(), student.getGpa());
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Student Name and GPA: " + studentNameAndGpaFunction.apply(students));
    }
}
