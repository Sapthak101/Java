import java.util.Scanner;

class base
{
    base()
    {
        System.out.println("I need base");
    }
}

class child extends base{

}

public class r1
{
    public static void main(String args[])
    {
        child c1=new child();
    }
}