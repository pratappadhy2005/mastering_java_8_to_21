package revisit.match;

import revisit.data.StudentDataBase;

public class StreamsMatchExample {

    // All match - all elements in the stream match the given predicate
    public static boolean allMatchExample() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGradeLevel() > 3.0);
    }

    public static boolean anyMatchExample() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGradeLevel() > 3.0);
    }

    public static boolean noneMatchExample() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGradeLevel() > 10.0);
    }

    public static void main(String[] args) {
        System.out.println("All match example: " + allMatchExample());
        System.out.println("Any match example: " + anyMatchExample());
        System.out.println("None match example: " + noneMatchExample());
    }
}
