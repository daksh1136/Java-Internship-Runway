package day6;

import java.sql.SQLOutput;

class Student {

    String name;
    int age;
    String course;

    void study() {
        System.out.println(name + " is studying");
    }
}

class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Daksh";
        s1.age = 20;
        s1.course = "B.Tech CSE";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.course);
        Student s2=new Student();
        s2.age=20;
        s2.name="srak";
        s2.course="mba";
        s2.study();
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.course);

        s1.study();
    }
}