import java.util.Scanner;

class Employee
{
    int depid, empid;

    void getdata()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your department id and employee id: ");
        depid=inp.nextInt();
        empid=inp.nextInt();
    }

}

class manager extends Employee
{
    void encash_m()
    {
        System.out.println("Enter the number of half days for the manager: ");
        Scanner inp=new Scanner(System.in);
        int days=inp.nextInt();

        System.out.println("Encashmnet: "+days*800);
    }
}

class worker extends manager
{
    void encash_w()
    {
        System.out.println("Enter the number of days for the worker: ");
        Scanner inp=new Scanner(System.in);
        int days=inp.nextInt();

        System.out.println("Encashmnet: "+days*500);
    }
}

class others extends worker
{
    void encash_o()
    {
        System.out.println("Enter the number of days for the others: ");
        Scanner inp=new Scanner(System.in);
        int days=inp.nextInt();

        System.out.println("Encashmnet: "+days*600);
    }

    void type()
    {
        System.out.println("You are an employee/worker/other type: e/w/o : ");
        Scanner inp=new Scanner(System.in);
        char ch=inp.next().charAt(0);

        if (ch=='e')
            encash_m();
        else if (ch=='w')
            encash_w();
        else 
            encash_o();
    }
}

public class Q3
{
    public static void main(String args[])
    {
        others obj1=new others();

        obj1.getdata();
        obj1.type();
    }
}