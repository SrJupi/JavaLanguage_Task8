package n3;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    private String course;
    private float grade;

    public Student(int seed) {
        Random rand = new Random(seed);

        String [] names = {"Marc", "Leo", "Alex", "Jan", "Nil",
                "Julia", "Martina", "Emma", "Lucia", "Ona"};
        String [] courses = {"Java", "Python", "C++", "C#", "Data Science",
                "Javascript", "BackEnd", "FullStack", "FrontEnd", "PHP"};

        this.name = names[seed/1000];
        this.age = rand.nextInt(18, 100);
        this.course = courses[seed/1000];
        this.grade = rand.nextInt(0, 10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", grade=" + grade +
                '}';
    }
}
