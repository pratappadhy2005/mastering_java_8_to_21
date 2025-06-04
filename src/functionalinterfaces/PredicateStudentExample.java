package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> p2 = (student) -> student.getGpa() >= 4.0;

    public static void filterStudentByGradeLevel(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.stream()
                .filter(p1.and(p2))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
    }
}
