package revisit.functionalinterfaces;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printName() {
        Consumer<Student> studentConsumer = student -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivities() {
        Consumer<Student> nameConsumer = student -> System.out.print("Name: " + student.getName() + ", ");
        Consumer<Student> activitiesConsumer = student -> System.out.println("Activities: " + student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(nameConsumer.andThen(activitiesConsumer));
    }

    public static void printNameAndActivitiesUsingCondition() {
        Consumer<Student> nameConsumer = student -> System.out.print("Name: " + student.getName() + ", ");
        Consumer<Student> activitiesConsumer = student -> System.out.println("Activities: " + student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                nameConsumer.andThen(activitiesConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("Consumed: " + t);
            }
        };

        printConsumer.accept("Hello, World!");

        // Using lambda expression
        Consumer<String> lambdaConsumer = t -> System.out.println("Consumed with lambda: " + t);
        lambdaConsumer.accept("Hello, Lambda!");

        // Print all student names
        printName();
        System.out.println("-----");
        // Print all student names and activities
        printNameAndActivities();
    }
}
