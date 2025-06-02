package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumer = (student) -> System.out.println(student.getName());
    static Consumer<Student> studentConsumer1 = (student) -> System.out.print(student.getName());
    static Consumer<Student> studentConsumer2 = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        System.out.println("Names of all students:");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentConsumer);
    }

    public static void printNameAndActivities() {
        System.out.println("Name and Activities of all students:");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentConsumer1.andThen(studentConsumer2)); // Consumer chaining
    }

    public static void printNameAndActivitiesCondition() {
        System.out.println("Students with grade level >= 3:");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach((student) -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                studentConsumer1.andThen(studentConsumer2).accept(student); // Consumer chaining
            }
        }); // Consumer chaining with condition
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (msg) -> {
            System.out.println("Message received: " + msg);
        };

        consumer.accept("Hello, World!");
        System.out.println("===================================");

        printName();
        System.out.println("===================================");

        printNameAndActivities();
        System.out.println("===================================");

        printNameAndActivitiesCondition();
        System.out.println("===================================");
    }
}
