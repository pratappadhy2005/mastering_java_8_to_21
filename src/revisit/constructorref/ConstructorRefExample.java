package revisit.constructorref;

import revisit.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefExample {
    Supplier<Student> studentSupplier = Student::new;

    static Function<Integer, Student> studentWithIdSupplier = Student::new;

    public static void main(String[] args) {
        ConstructorRefExample example = new ConstructorRefExample();
        Student student = example.studentSupplier.get();
        System.out.println("Student created: " + student);

        Student studentWithId = studentWithIdSupplier.apply(101);
        System.out.println("Student with ID created: " + studentWithId);
    }
}
