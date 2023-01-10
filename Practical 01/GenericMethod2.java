/* Write a program in java that will use Generic Methods
 * 
 * There are following kind of Generic Types
 * T Type
 * E Element
 * K Key
 * V Value
 * N Number
 * 
 * Understand the use of K, V Types
 * S, V
 */

 class Pair<K, V>
 {
    private K key;
    private V value;

    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public void setKey()
    {
        this.key = key;
    }

    public V getValue()
    {
        return value;
    }

    public void setValue()
    {
        this.value = value;
    }
 }

public class GenericMethod2
{
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2)
    {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    };

    public static void main(String args[])
    {
        // Todo auto-generated method stub
        Pair<Integer, String> p1 = new Pair<>(1, "Atul Vishwakarma");
        Pair<Integer, String> p2 = new Pair<>(2, "Bhavesh Sawant");

        boolean result = GenericMethod2.compare(p1, p2);

        System.out.println(result);
    }
}