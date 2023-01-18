interface Constr{
    String addstr(String fname,String lname);
    }
    public class LambdaExpressionExample {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    // TODO code application logic here
    String fname="Atul";
    String lname="Vishwakarma";
    Constr ctr=(String f,String l)->{return f+" "+l;};
    String fullstring=ctr.addstr(fname,lname);
    System.out.println("My Full name is "+fullstring);
    }
    }