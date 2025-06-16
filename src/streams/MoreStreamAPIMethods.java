package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MoreStreamAPIMethods {
    public static void main(String[] args) {
        final List<Student> studentList = StudentDataBase.getAllStudents();

        getTotalNumberOfActivities(studentList);

        printActivities(studentList);
    }

    private static void getTotalNumberOfActivities(List<Student> studentList) {
        // Method to calculate the total number of activities
        final long totalActivities = studentList.stream()
                .flatMap(student -> student.getActivities().stream())
                .count();
        System.out.println("Total number of activities: " + totalActivities);
    }

    private static void printActivities(List<Student> studentList) {
        final List<String> activityList = studentList.stream()
                .flatMap(student -> student.getActivities().stream())
                .distinct() // Ensure activities are unique
                .sorted()
                .collect(Collectors.toList());
        System.out.println(activityList);
    }
}
