package revisit.methodref;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodRefExample {

    static Predicate<Student> p1 = RefactorMethodRefExample::greaterTHanGradeLevel;

    public static boolean greaterTHanGradeLevel(Student s) {
        return s.getGpa()>=3.9;
    }

    public static void main(String[] args) {
        Student student = StudentDataBase.getAllStudents().get(0);
        System.out.println(p1.test(student));
    }
}
