package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //Spring XML Configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        TeachAble teachAble = context.getBean("TeachAble", TeachAble.class);
//        teachAble.teach();

        Student student = context.getBean("student", Student.class);
        student.callYourTeacher();
        System.out.println("His name is " + student.getName() + ". Him " + student.getAge() + " years old!");

//        JavaTeacher javaTeacher = new JavaTeacher();
//        Student student1 = new Student(javaTeacher);
//        student1.callYourTeacher();

        //Polymorphism
//        TeachAble teachAble1 = new JavaTeacher();
//        teachAble1.teach();
//
//        JavaTeacher javaTeacher = new JavaTeacher();
//        javaTeacher.teach();
    }
}
