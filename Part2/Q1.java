import java.util.Scanner;

public class Q1
{
    public static void main (String args[])
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double num1=inp.nextDouble();
        double num2=inp.nextDouble();
        double num3=inp.nextDouble();

        if ((num1>=num2) && (num1>=num3))
        {
            System.out.println("Num1 is the greatest: "+num1);
        }
        else if ((num2>=num1) && (num2>=num3))
        {
            System.out.println("Num2 is the greatest: "+num2);
        }
        else 
            System.out.println("Num3 is the greatest: "+num3);
    }
}