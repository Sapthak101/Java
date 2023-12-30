import java.util.Scanner;

class multi
{
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int mul(int a, int b, int c)
    {
        return a*b*c;
    }
    static float mul(float a, float b)
    {
        return a*b;
    }
    static float mul(float a, float b, float c)
    {
        return a*b*c;
    }
}

public class Q5
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the number of numbers you want to enter: ");
        int count=inp.nextInt();
        if (count==2)
        {
            System.out.println("Do you want to do a float/integer operation (0/1): ");
            int count2=inp.nextInt();
            if (count2==1)
            {
                System.out.println("Enter two number in integer format: ");
                int num1=inp.nextInt();
                int num2=inp.nextInt();
                System.out.println("The multiplication is: "+multi.mul(num1, num2));
            }
            else
            {
                System.out.println("Enter two number in float format: ");
                float num1=inp.nextFloat();
                float num2=inp.nextFloat();
                System.out.println("The multiplication is: "+multi.mul(num1, num2));
            }
        }
        else
        {
            System.out.println("Do you want to do a float/integer operation (0/1): ");
            int count2=inp.nextInt();
            if (count2==1)
            {
                System.out.println("Enter three number in integer format: ");
                int num1=inp.nextInt();
                int num2=inp.nextInt();
                int num3=inp.nextInt();
                System.out.println("The multiplcation is: "+multi.mul(num1, num2, num3));
            }
            else
            {
                System.out.println("Enter three number in float format: ");
                float num1=inp.nextFloat();
                float num2=inp.nextFloat();
                float num3=inp.nextFloat();
                System.out.println("The multiplcation is: "+multi.mul(num1, num2, num3));
            }
        }
    }
}