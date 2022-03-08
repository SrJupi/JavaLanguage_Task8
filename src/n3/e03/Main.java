package n3.e03;

import n3.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //create students list
        ArrayList<Student> students= new ArrayList<>();
        //create 10 random students
        for (int i = 0; i < 10; i++) {
            students.add(new Student(i*1000));
        }

        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .forEach(System.out::println);



    }
}
