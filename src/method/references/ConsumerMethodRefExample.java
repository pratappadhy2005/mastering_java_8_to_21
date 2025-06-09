package method.references;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodRefExample {

    static Consumer<Student> studentConsumerLambda = (student) -> System.out.println(student);
    static Consumer<Student> studentConsumerMethodRef = System.out::println;

    static Consumer<Student> studentConsumer = Student::printActivities;


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumerLambda);
        System.out.println("===================================");
        StudentDataBase.getAllStudents().forEach(studentConsumerMethodRef);
        System.out.println("===================================");
        StudentDataBase.getAllStudents().stream()
                .forEach(student -> studentConsumer.accept(student));
    }
}
