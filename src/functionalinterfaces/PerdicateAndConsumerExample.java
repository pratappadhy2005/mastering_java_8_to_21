package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PerdicateAndConsumerExample {

    Predicate<Student> predicate = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> predicate2 = (student) -> student.getGpa() >= 4.0;

    BiConsumer<String, List<String>> biComsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };

    Consumer<Student> consumer = ((student) -> {
        if(predicate.and(predicate2).test(student)) {
            biComsumer.accept(student.getName(), student.getActivities());
        } else {
            System.out.println("Student does not meet the criteria.");
        }
    });

    public void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.stream()
                .forEach(consumer);
    }

    public static void main(String[] args) {
        new PerdicateAndConsumerExample().printNameAndActivities();
    }
}
