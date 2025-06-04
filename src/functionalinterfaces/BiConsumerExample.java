package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivitoes(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.print("Name: " + name);
            System.out.println(" - Activities: " + activities);
        };

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (inout1, inout2) -> {
            System.out.println("Input 1: " + inout1);
            System.out.println("Input 2: " + inout2);
        };

        biConsumer.accept("pratap", "padhy");

        BiConsumer<Integer, Integer> sumConsumer = (a, b) -> {
            int sum = a + b;
            System.out.println("Sum: " + sum);
        };

        sumConsumer.accept(10, 20);

        BiConsumer<Integer, Integer> multiplyConsumer = (a, b) -> {
            int product = a * b;
            System.out.println("Multiply: " + product);
        };

        System.out.println("===================================");

        sumConsumer.andThen(multiplyConsumer).accept(10, 20); // Chaining BiConsumers

        System.out.println("===================================");
        nameAndActivitoes();
    }
}
