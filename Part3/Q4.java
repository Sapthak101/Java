class static_imple
{
    static int i=0;

    static_imple()
    {
        i++;
    }

    void display()
    {
        System.out.println("The number of objects created are: "+i);
    }
}

public class Q4
{
    public static void main(String args[])
    {
        static_imple c1=new static_imple();
        static_imple c2=new static_imple();
        static_imple c3=new static_imple();

        c1.display();
    }
}