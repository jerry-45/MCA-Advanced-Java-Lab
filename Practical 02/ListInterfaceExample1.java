import java.util.concurrent.ArrayBlockingQueue;

/* Write a Java program to create List containing list of items of type String and use for-each loop to print the items of the list */

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample1
{
    public static void main(String args[])
    {
        // Todo auto-generated method stub
        List<String> myList = new ArrayList<String>();
        myList.add("Aditya Tiwari");
        myList.add("Neeraj Chauhan");
        myList.add("Atul Vishwakarma");
        myList.add("Deepak Tiwari");

        for(String item : myList)
        {
            System.out.println(item);
        }
    }
}