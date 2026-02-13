package revisit.stream;

import revisit.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public Long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents()
                .stream()
                .flatMap(student -> student.getActivities().stream())
                .distinct()
                .count();
    }
    public List<String> getStudentActivities() {
        return StudentDataBase.getAllStudents()
                .stream()
                .flatMap(student -> student.getActivities().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FlatMapExample flatMapExample = new FlatMapExample();
        List<String> studentActivities = flatMapExample.getStudentActivities();
        System.out.println(studentActivities);

        System.out.println("Total number of activities: ");
        System.out.println(flatMapExample.getStudentActivitiesCount());
    }
}
