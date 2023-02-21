package com.hiraymca;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
public class MainApp {
private static int rollno;
private static String sname;
private static int age;
public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
Scanner sc=new Scanner(System.in);
StudentDAO stud=(StudentDAO)context.getBean("studentDAO");
System.out.println("Enter rollno");
rollno=sc.nextInt();
System.out.println("Enter student name");
sname=sc.next();
System.out.println("Enter age");
age=sc.nextInt();
stud.saveStudent(new Student(rollno,sname,age));
System.out.println("Record inserted successfully");
}
}