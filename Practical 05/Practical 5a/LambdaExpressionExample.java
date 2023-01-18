interface HelloWorld {
    void sayHello();
    }
    public class LambdaExpressionExample {
    public static void main(String args[]){
    HelloWorld helloworld=()->{System.out.println("Hello World");};
    helloworld.sayHello();
    }
    }