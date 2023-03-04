import java.util.Scanner;

public class minimum
{
    public static int min(int num)
    {
        return num+num;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=inp.nextInt();

        System.out.println("The doubling of the number: "+ min(num));
    }

}