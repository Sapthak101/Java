import java.util.Scanner;
public class Q5 {
    public static void main(String args[])
    {
        int num;

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=inp.nextInt();
        boolean a;
        a=true;
        char a1;
        a1='a';
        int num2=num;
        int num3=0;
            
        while (num!=0)
        {
            num3=num3*10+num%10;
            num/=10;
        }

        if (num2==num3)
            System.out.println("The number is pallindrome");
        else
            System.out.println("The number is not pallindrome");
    }
}