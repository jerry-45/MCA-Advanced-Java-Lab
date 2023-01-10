/*  Understand the Generic Class
    Write a Java Program to demonstrate a Generic Class  */

public class GenericClassExample<T>
{
    private T dvariable;

    public T getDvariable()
    {
        return dvariable;
    }

    public void setDvariable(T dvariable)
    {
        this.dvariable = dvariable;
    }

    public static void main(String args[])
    {
        GenericClassExample<Integer> intvar = new GenericClassExample<>();
        intvar.setDvariable(10);
        System.out.println("Variable value: " + intvar.getDvariable());

        GenericClassExample<String> strvar = new GenericClassExample<>();
        strvar.setDvariable("Atul Vishwakarma");
        System.out.println("Variable name: " + strvar.getDvariable());
    }
}