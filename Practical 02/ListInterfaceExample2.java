/* Write a Java program to create List containing list of items and use ListIterator interface to print items present in the list. Also print the list in reverse/backward direction. */

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceExample2
{
    public static void main(String args[])
    {
        // Todo auto-generated method stub
        List<Integer> numberList = new ArrayList<Integer>();

        // Generating list of 10 numbers
        for(int i = 1; i <= 10; i++)
        {
            numberList.add(i);
        }

        // Printing the list using ListIterator
        ListIterator<Integer> litr = numberList.listIterator();
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

        // Printing the list using ListIterator in reverse/backward direction
        System.out.println("List in Reverse/Backward Order");
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }    
}
