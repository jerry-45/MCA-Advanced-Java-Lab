/* Write a Java Program to create a Set containing list of items of type String and print the items in the list using Iterator interface. Also print the list in reverse/backward direction. */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class setExample
{
    public static void main(String args[])
    {
        String ans = null;
        int rn;
        String sn;
        double per;
        
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        int choice;
        // Creating set of Students
        HashSet<Student> studentSet = new HashSet<Student>();
        Iterator i;

        //Creating student
        do
        {
            System.out.println("Menu");
            System.out.println("1. Add Student");
            System.out.println("2. List all Students");
            System.out.println("3. List in Reverse direction");
            System.out.println("4. Exit");
            System.out.println("Enter your choice(1..4)");
            choice = sc.nextInt();
            int flag = 0;

            switch(choice)
            {
                case 1:
                System.out.println("Enter Roll No.:");
                rn = sc.nextInt();
                System.out.println("Enter Name:");
                sn = sc.next();
                System.out.println("Enter Percentage:");
                per = sc.nextDouble();
                s = new Student(rn, sn, per);
                studentSet.add(s);
                break;

            case 2:
            System.out.println("Roll No.: " + "\t" + "Name: " + "\t" + "Percentage: ");
            studentSet.forEach((s1) -> {
                System.out.println(s1.getRollno() + "\t" + s1.getName() + "\t" + s1.getPercentage());
            });
            break;

            case 3:
                Comparator<Student> c = Comparator.comparing(Student::getRollno,Comparator.reverseOrder()).thenComparing(Student::getName,Comparator.reverseOrder());
                List<Student>list=new ArrayList<>(studentSet);
                list.sort(c);
                System.out.println("Rollno"+"\t"+"Name"+"\t"+"Percentage");
                for(Student s2:list)
                {
                    System.out.println(s2.getRollno()+"\t"+s2.getName()+"\t"+s2.getPercentage());
                }
                break;

            case 4:
                System.exit(0);
                break;
            }

            //adding student in HashSet
            System.out.print("Do you wish to continue(y/n)");
            ans=sc.next();
            }
            while(ans.equals("Y")||ans.equals("y"));
            //reteriving the student from set
        }
    }
