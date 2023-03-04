import java.util.Scanner;

class A{
    int a, b, c;

    void cal(int a, int b){
        c=a*b;
    }
    void cal2(A a1)
    {
        a1.c=2;
    }
    void disp()
    {
        System.out.println(+c);
    }
}

public class Demo_class{
    public static void main(String args[])
    {
        A a1=new A();
        a1.cal(2,3);

        A a2=new A();
        a2.cal2(a1);
        a1.disp();
    }
}
