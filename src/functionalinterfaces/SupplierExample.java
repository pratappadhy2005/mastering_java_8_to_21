package functionalinterfaces;

import data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    static Supplier<String> supplier = () -> "Hello, World!";

    static Supplier<Student> studentSupplier = () -> new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));

    static Supplier<List<Student>> sudentListSupplier = () -> data.StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(studentSupplier.get());

        sudentListSupplier.get().stream().forEach(
                student -> System.out.println(student.getName() + " " + student.getGradeLevel() + " " + student.getGpa() + " " + student.getGender() + " " + student.getActivities()));
    }
}
