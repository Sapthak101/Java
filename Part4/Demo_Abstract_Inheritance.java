abstract class a1{
    int a;
    double b;

    abstract void getdata();
    void demo()
    {

    }
}

class a2 extends a1{
    double c=10;
    void getdata(){
        b=56.8;
        
        System.out.println(+c);
    }
    void demo(){
        System.out.println("Only created");
        }
}

class a3 extends a2{
    double d=30;
    void getdata(){
        b=56.78;
        
        System.out.println(+d);
    }
}

public class Demo_Abstract_Inheritance{
    public static void main(String args[])
    {
        a1 obj=new a2();
        obj.getdata();
        obj.demo();
        obj=new a3();
        //oj.getdata();
        obj.getdata();
    }
}