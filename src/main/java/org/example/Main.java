package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static List<Student> student;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student name");
        String name=sc.nextLine();
        System.out.println("Enter Student age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter studentId");
        String studentId=sc.nextLine();
        Student s1 = new Student(name,age,studentId);
        System.out.println("Enter how many courses you want to register?");
        int courceCount=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<courceCount;i++){
            System.out.println("Enter Course Name");
            String courseName=sc.nextLine();
            s1.enrollCourse(courseName);

        }


        Student s2 = new Student("Kiran", 33, "kir99");
        s2.enrollCourse("C");
        s2.enrollCourse("english");

        Student s3 = new Student("Arun", 34, "Nag29");
        s3.enrollCourse("Social");
        s3.enrollCourse("Science");

        s1.printstudentInfo();
        s2.printstudentInfo();
        s3.printstudentInfo();

        student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);

        findStudentById("rk29");


    }
    static void  findStudentById(String stdID){
        for(Student stu:student){
            if(stu.studentId.equalsIgnoreCase(stdID)){
                System.out.println("Found ID");
            }
            else {
                System.out.println("Not found");


                }
            }
        }

}