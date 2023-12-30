import java.util.Scanner;

class A
{
    static int num22=4;
    int num3=5;
    static void demo1(){
        int num2=3;
        
        System.out.println("Hello2");
    }
    void demo2()
    {
        System.out.println("Another Message"+num22);
        demo1();
    }
}

public class Static2
{

    static int num=2;
    int num4=6;

    static void demo()
    {
        int num=34;
        System.out.println("Hello"+num);
    }
    void demo4()
    {
        System.out.println("Message");
    }
    public static void main(String args[])
    {
        demo();
        A.demo1();
        A a1=new A();
        a1.demo2();
    
    }
}