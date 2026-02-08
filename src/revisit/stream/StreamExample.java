package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (s) -> s.getGradeLevel() >= 3;
        Predicate<Student> studentGPAPredicate = (s) -> s.getGpa() >= 3.9;

        // student name and their activity in a map
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                //.stream()
                .parallelStream()
                .filter(studentPredicate)
                .filter(studentGPAPredicate)
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));
        System.out.println(studentMap);
    }
}
