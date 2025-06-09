package method.references;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> toUpperCaseLambda = (str) -> str.toUpperCase();
    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

    static Consumer<Student> studentConsumer = Student::printActivities;



    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("hello world"));
        System.out.println(toUpperCaseMethodRef.apply("hello world"));
        StudentDataBase.getAllStudents().stream()
                .forEach(student -> studentConsumer.accept(student));
    }
}
