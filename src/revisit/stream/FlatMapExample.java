package revisit.stream;

import revisit.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public List<String> getStudentActivities() {
        return StudentDataBase.getAllStudents()
                .stream()
                .flatMap(student -> student.getActivities().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FlatMapExample flatMapExample = new FlatMapExample();
        List<String> studentActivities = flatMapExample.getStudentActivities();
        System.out.println(studentActivities);
    }
}
