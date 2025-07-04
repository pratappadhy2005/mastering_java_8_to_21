package match;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class MatchExample {

    public static boolean allMatch() {
        boolean isAllStudentGradeGreaterThan3 = StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGradeLevel() >= 3);

        return isAllStudentGradeGreaterThan3;
    }

    public static boolean anyMatch() {
        boolean isAnyStudentGradeGreaterThan3 = StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGradeLevel() >= 3);

        return isAnyStudentGradeGreaterThan3;
    }

    public static boolean noneMatch() {
        boolean isNoStudentGradeGreaterThan3 = StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGradeLevel() >= 3);

        return isNoStudentGradeGreaterThan3;
    }

    public static void main(String[] args) {
        System.out.println("Are all students in grade level 3 or above? " + allMatch());
        System.out.println("Is any student in grade level 3 or above? " + anyMatch());
        System.out.println("Are no students in grade level 3 or above? " + noneMatch());
    }
}
