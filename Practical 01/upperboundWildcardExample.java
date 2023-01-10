/* Write a program in java to understand the use of upperbound wildcard ? extends */

import java.util.ArrayList;
import java.util.List;

public class upperboundWildcardExample {
    public static void sumOfElements(List<? extends Number> numberList)
    {
        double sum = 0.0;
        for(Number n : numberList)
        {
            sum += n.doubleValue();
        }
        System.out.println("Sum of all elements is " + sum);
    }

    public static void main(String args[])
    {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        sumOfElements(intList);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(24.56);
        doubleList.add(21.24);
        doubleList.add(124.16);
        doubleList.add(121.14);
        sumOfElements(doubleList);
    }
}
