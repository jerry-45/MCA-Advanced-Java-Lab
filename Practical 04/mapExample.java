/* Write a Java program using Map interface containing list of items having keys and associated values and perform the following operations:
 * a) Add items in the map
 * b) Remove items from the map
 * c) Search specific key from the map
 * d) Get value of the specific key
 * e) Insert map elements of one map into the other map
 * f) Print all keys and values of the map
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapExample
{
    public static void main(String args[])
    {
        // Creating map of books
        Map<Integer, Book> map = new HashMap<Integer, Book>();

        // Creating books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar");
        Book b2 = new Book(102, "Data Communication & Networking", "Forouzan");
        Book b3 = new Book(103, "Operating System", "Achuyut Godbole");

        // Adding books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        // Traverse the map
        for(Map.Entry<Integer, Book> entry : map.entrySet())
        {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("Book ID: " + b.getID() + ", Book Name: " + b.getName() + ", Author: " + b.getAuthor());
        }

        // Removing element from map
        map.remove(2);

        // Traverse the map after removing
        System.out.println();
        System.out.println("Traversing map after removing 2nd element");
        for(Map.Entry<Integer, Book> entry : map.entrySet())
        {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("Book ID: " + b.getID() + ", Book Name: " + b.getName() + ", Author: " + b.getAuthor());
        }

        // Searching for specific entry
        System.out.println();
        int myKey;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        myKey = sc.nextInt();

        for(Map.Entry<Integer, Book> entry : map.entrySet())
        {
            int key = myKey;
            Book b = entry.getValue();

            if(b.getID() == key)
            {
                System.out.println("Book ID: " + b.getID() + ", Book Name: " + b.getName() + ", Author: " + b.getAuthor());
            }
        }
    }
}