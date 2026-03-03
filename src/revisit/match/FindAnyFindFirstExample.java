package revisit.match;

import revisit.data.Student;
import revisit.data.StudentDataBase;

public class FindAnyFindFirstExample {
    public Student findAnyExample() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() > 3)
                .findAny()
                .orElse(new Student("Default"));
    }

    public Student findFirstExample() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() > 3)
                .findFirst()
                .orElse(new Student("Default"));
    }

    public static void main(String[] args) {
        FindAnyFindFirstExample findAnyFindFirstExample = new FindAnyFindFirstExample();
        System.out.println("Find any example: " + findAnyFindFirstExample.findAnyExample());
        System.out.println("Find first example: " + findAnyFindFirstExample.findFirstExample());
    }
}
