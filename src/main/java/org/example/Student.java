package org.example;

public class Student {
    private String name;
    private int age;
    private JavaTeacher javaTeacher;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Student(JavaTeacher javaTeacher) {
//        this.javaTeacher = javaTeacher;
//    }

    public void callYourTeacher() {
        javaTeacher.teach();
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

    public JavaTeacher getJavaTeacher() {
        return javaTeacher;
    }

    public void setJavaTeacher(JavaTeacher javaTeacher) {
        this.javaTeacher = javaTeacher;
    }
}
