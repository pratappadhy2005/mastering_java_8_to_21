package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

public class StreamMapReduceFilterExample {


    public static int getTotalNoteBooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getTotalNoteBooks());
    }
}
