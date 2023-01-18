public class Student
{
    int rollno;
    String name;
    Double percentage;

    public Student(int rollno, String name, Double percentage)
    {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    public Student()
    {

    }

    public int getRollno()
    {
        return rollno;
    }

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPercentage()
    {
        return percentage;
    }

    public void setPercentage(Double percentage)
    {
        this.percentage = percentage;
    }
}