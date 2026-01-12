package revisit.functionalinterfaces;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateExample {

    Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;

    Consumer<Student> studentConsumer = (student) -> {
        System.out.println(student.getName());
    };

    BiConsumer<String, List<String>> studentActivitiesConsumer = (name,activities) -> {
        System.out.println(name + " : "+ activities);
    };
    public void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.stream()
                .filter(studentPredicate)
                .forEach(studentConsumer);
    }

    public void printNameAndActivitiesBiConsumer(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.stream()
                .filter(studentPredicate)
                .forEach((student) -> studentActivitiesConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        ConsumerPredicateExample example = new ConsumerPredicateExample();
        example.printNameAndActivities();
    }
}
