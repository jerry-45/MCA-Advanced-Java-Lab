package com.hiraymca;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import
org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
public class MainApp {
public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext context=new
ClassPathXmlApplicationContext("Beans.xml");
StudentJDBCTemplate studentJDBCTemplate;
studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("stude
ntJDBCTemplate");
int choice;
int id;
int rollno;
String sname;
int age;
String ans=null;
Scanner sc=new Scanner(System.in);
do
{
    System.out.println("Select the choice");
    System.out.println("1.Insert record ");
    System.out.println("2.Read record");
    System.out.println("3.List all the records");
    System.out.println("4.Delete the record");
    System.out.println("5.Exit");
    System.out.print("Enter your choice(1..5):");
    choice=sc.nextInt();
    switch(choice)
    {
        case 1:
        //inserting a record
        System.out.print("Enter roll no");
        rollno=sc.nextInt();
        System.out.println("Enter name");
        sname=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        studentJDBCTemplate.create(rollno, sname, age);
        break;
        case 2:
        //reading a record
        Student student;
        System.out.println("Enter record id");
        id=sc.nextInt();
        try
        {
            student=studentJDBCTemplate.readStudent(id);
            System.out.println("id="+student.getId());
            System.out.println("Rollno="+student.rollno);
            System.out.println("Name="+student.getSname());
            System.out.println("Age="+student.getAge());
            }catch(Exception ex)
            {
            }
            case 3:
            System.out.println("Record not found");
            break;
            //listing all the records
            List<Student>
            students=studentJDBCTemplate.listStudents();
            System.out.println("id"+"\t"+"Rollno"+"\t"+"Name"+"\t\t"+"Age");
            for (Student record : students) {
            System.out.println(record.getId()+"\t"+record.getRollno()+"\t"+record.
            getSname()+"\t\t"+record.getAge());
            }
            break;
            case 4:
            // delete the record
            System.out.println("Enter record id");
            id=sc.nextInt();
            try
            {
                studentJDBCTemplate.delete(id);
            }
            catch(Exception ex)
            {
            }
            case 5:
            }
            System.out.println("Record not found");
            break;
            System.exit(0);
            break;
            System.out.println("Do you wish to continue(y/n)");
            ans=sc.next();
            }while(ans.equals("Y")||ans.equals("y"));
            }
            }                