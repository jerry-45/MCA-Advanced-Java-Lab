/* Write a Java Program using Set interface containing list of items and perform the following operations:
 * a. Add items in the set
 * b. Insert items of one set into other set
 * c. Remove items from the set
 * d. Search the specified item in the set
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class setExample 
{
    public static void main(String []args)
    {
        String ans=null;
        int rn;
        String sn;
        double per;
    
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        
        int choice;
        
        //Creating set of students
        HashSet<Student>studentSet=new HashSet<Student>();
        Iterator i;

        //Creating Students
        do
        {
            System.out.println("Menu");
            System.out.println("1.Adding student");
            System.out.println("2.Removing student");
            System.out.println("3.Search student");
            System.out.println("4.List all students");
            System.out.println("5.Exit");
            System.out.print("Enter your choice(1..4)");
            
            choice=sc.nextInt();
            int flag=0;

            switch(choice)
            {
                case 1:
                    System.out.print("Enter rollno");
                    rn=sc.nextInt();
                    System.out.print("Enter name");
                    sn=sc.next();
                    System.out.print("Enter percentage");
                    per=sc.nextDouble();
                    s=new Student(rn,sn,per);
                    studentSet.add(s);
                    break;

                case 2:
                    System.out.print("Enter roll no to remove element");
                    rn=sc.nextInt();
                    i=studentSet.iterator();
                    while(i.hasNext())
                    {
                        s=(Student)i.next();
                        if(s.getRollno()==rn)
                        {
                            i.remove();
                            System.out.println("Element is successfully removed");
                            break;
                        }
                        else
                        {
                            System.out.println("Rollno="+rn);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of student");
                    sn=sc.next();
                    i=studentSet.iterator();
                    if(!i.hasNext())
                    {
                        System.out.println("List is empty");
                    }
                    while(i.hasNext())
                    {
                        s=(Student)i.next();
                        if(s.getName().equals(sn))
                        {
                            System.out.println("Record found");
                            System.out.println(s.getRollno()+" "+s.getName()+" "+s.getPercentage());
                            flag=1;
                            break;
                        }

                        if(flag!=1)
                        {
                            System.out.println("Record not found search again");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Rollno"+"\t"+"Name"+"\t"+"Percentage");
                    studentSet.forEach((s1) -> {
                        System.out.println(s1.getRollno()+" "+s1.getName()+" "+s1.getPercentage());
                    });
                    break;

                case 5:
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
