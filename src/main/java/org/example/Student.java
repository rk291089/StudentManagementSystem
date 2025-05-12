package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

   private String name=null;
   private int age=0;
   public String studentId=null;
   private List<String> courses=null;

    Student(String name,int age, String studentId ){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
        this.courses=new ArrayList<>();

    }

    public void enrollCourse(String course){
        courses.add(course);
    }

    public void printstudentInfo(){
        System.out.println("Student name is " +name+" age is: "+age);
        System.out.println("Courses Enrolled are: "+courses);
    }

}
