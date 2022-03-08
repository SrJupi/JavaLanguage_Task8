package n3.e05;

import n3.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create students list
        ArrayList<Student> students= new ArrayList<>();
        //create 10 random students
        for (int i = 0; i < 10; i++) {
            students.add(new Student(i*1000));
        }

        students.stream()
                .filter(student ->
                        (student.getAge() >= 18 &&
                        student.getCourse().equals("Java")))
                .forEach(System.out::println);



    }
}
