package n3.e02;

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

        List<Student> namestartWithA = students.stream()
                .filter(student -> student.getName().toLowerCase().charAt(0) == 'a')
                .collect(Collectors.toList());

        System.out.println(namestartWithA);

    }
}
