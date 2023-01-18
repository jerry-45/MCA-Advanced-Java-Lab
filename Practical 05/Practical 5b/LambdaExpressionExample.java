interface findCube
{
int cube(int num);
}
public class LambdaExpressionExample {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
findCube cubeobj=(int x)->{return x*x*x;};
int result=cubeobj.cube(2);
System.out.println("Cube of Enter number is="+result);
}
}