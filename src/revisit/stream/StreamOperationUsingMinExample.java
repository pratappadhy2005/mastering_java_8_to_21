package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

public class StreamOperationUsingMinExample {

    public static int getStudentWithMinNoteBooks(){
        int minNoteBooks = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(Integer.MAX_VALUE, Integer::min);
        return minNoteBooks;
    }

    public static void main(String[] args) {
        int min = java.util.stream.IntStream.of(1, 2, 3, 4, 5)
                .min()
                .orElse(-1);
        System.out.println(min);

        System.out.println("********************");

        System.out.println(getStudentWithMinNoteBooks());

    }
}
