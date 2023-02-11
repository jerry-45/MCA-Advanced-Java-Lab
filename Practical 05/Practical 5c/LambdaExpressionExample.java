interface Calculator
{
    int add(int x,int y);
}
public class LambdaExpressionExample {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1=20,num2=10;
        Calculator calc=(int n1,int n2)->{return num1+num2;};
        int result=calc.add(num1, num2);
        System.out.println("Addition of two number is ="+result);
    }
}