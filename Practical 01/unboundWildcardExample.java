/* Write a program in java to understand the use of unbound wildcard ? */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class unboundWildcardExample
{
    public static void printArray(List<?> myList)
    {
        Iterator itr = myList.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("--------------------");
    }

    public static void main(String args[])
    {
        // Todo auto-generated method stub
        ArrayList<Integer> myNumberList = new ArrayList<Integer>();
        myNumberList.add(1);
        myNumberList.add(2);
        myNumberList.add(3);

        printArray(myNumberList);

        ArrayList<String> myNameList = new ArrayList<>();
        myNameList.add("Atul Vishwakarma");
        myNameList.add("Parth Dalvi");
        myNameList.add("Atharva Parab");

        printArray(myNameList);        
    }
}