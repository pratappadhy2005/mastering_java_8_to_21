package revisit.functionalinterfaces;

import revisit.data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<String> stringSupplier = () -> "Hello, Supplier!";

    static Supplier<data.Student> studentSupplier = () -> new data.Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));

    static Supplier<List<Student>> studentListSupplier = () -> revisit.data.StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(stringSupplier.get());

        System.out.println(studentSupplier.get());

        studentListSupplier.get().stream().forEach(
                student -> System.out.println(student.getName() + " " + student.getGradeLevel() + " " + student.getGpa() + " " + student.getGender() + " " + student.getActivities()));
    }
}
