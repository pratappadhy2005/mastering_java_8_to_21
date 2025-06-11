package constructorref;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<Student, String> studentNameFunction = Student::getName;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentNameFunction.apply(new Student("John Doe")));
    }
}
