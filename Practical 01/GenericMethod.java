/* Write  program in java that will use Generic Methods
 * 
 * There are following kind of Generic Types
 * T Type
 * E Element
 * K Key
 * V Value
 * N Number
 */

public class GenericMethod
{
    // print array is generic method
    public static <E> void printArray(E[] inputArray)
    {
        // display array element
        for(E element: inputArray)
        {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        // Todo auto-generated method stub
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.45, 2.35, 4.63, 8.56};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer Elements:");
        printArray(intArray);

        System.out.println("Double Elements:");
        printArray(doubleArray);

        System.out.println("Character Elements:");
        printArray(charArray);
    }
}
