package revisit.functionalinterfaces;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    BiPredicate<String, List<String>> multiValuePredicate =
            (name, activities) -> name.equals("Emily") && activities.contains("swimming");

    public void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.stream()
                .filter(student -> multiValuePredicate.test(student.getName(), student.getActivities()))
                .forEach(student -> System.out.println(student.getName() + " : " + student.getActivities()));
    }

    public static void main(String[] args) {
        BiPredicateExample example = new BiPredicateExample();
        example.printNameAndActivities();
    }
}
