package flatmap;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        final List<Student> studentList = StudentDataBase.getAllStudents();

        final Set<String> activityList = studentList.stream()
                .flatMap(student -> student.getActivities().stream())
                .collect(Collectors.toSet());
        System.out.println(activityList);
    }
}
