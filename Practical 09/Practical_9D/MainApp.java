package com.hiraymca;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.context.ApplicationContext;
import
org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
public class MainApp {
private static int rollno;
private static String sname;
private static int age;
private static int choice;
private static String ans;
public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext context=new
ClassPathXmlApplicationContext("Beans.xml");
Scanner sc=new Scanner(System.in);
StudentDAO stud=(StudentDAO)context.getBean("studentDAO");
do
{
System.out.println("1.Insert record");
System.out.println("2.List all record");
System.out.println("3.Exit");
System.out.print("Enter your choice(1..3)");
choice=sc.nextInt();
switch(choice)
{
    case 1:
    //inserting record
    System.out.print("Enter rollno");
    rollno=sc.nextInt();
    System.out.print("Enter student name");
    sname=sc.next();
    System.out.print("Enter age");
    age=sc.nextInt();
    stud.saveStudent(new Student(rollno,sname,age));
    System.out.println("Record inserted successfully");
    break;
    case 2:
    //listing record
List<Student>slist=stud.listStudents();
System.out.println("Rollno"+"\t"+"Name"+"\t"+"Age");
for (Student student : slist) {
System.out.println(student.getRollno()+"\t"+student.getSname()+"\
t"+student.getAge());
}
break;
case 3:
//exiting from application
System.exit(0);
}
System.out.print("Do you wish to cotinue(y/n) ");
ans=sc.next();
}while(ans.equals("y")||ans.equals("Y"));
}
}