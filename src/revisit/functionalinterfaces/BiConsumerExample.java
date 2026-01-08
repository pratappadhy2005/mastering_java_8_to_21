package revisit.functionalinterfaces;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    BiConsumer<String, Integer> biConsumer = (name, age) -> {
        System.out.println("Name: " + name + ", Age: " + age);
    };

    BiConsumer<Integer, Integer> multiplyAndPrint = (a, b) -> {
        System.out.println("Multiplication: " + (a * b));
    };

    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> nameAndActivitiesConsumer = (name, activities) -> {
            System.out.println("Name: " + name + ", Activities: " + activities);
        };
        studentList.forEach(student ->
            nameAndActivitiesConsumer.accept(student.getName(), student.getActivities())
        );
    }
    BiConsumer<Integer, Integer> addAndPrint = (a, b) -> {
        System.out.println("Sum: " + (a + b));
    };

    public static void main(String[] args) {
        BiConsumerExample example = new BiConsumerExample();
        example.biConsumer.accept("Alice", 30);
        example.biConsumer.accept("Bob", 25);

        System.out.println("--- Multiplication Examples ---");

        example.multiplyAndPrint.andThen(example.addAndPrint).accept(5, 4);

        System.out.println("--- Name and Activities ---");

        nameAndActivities();
    }
}
