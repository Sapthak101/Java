import java.util.Scanner;

public class minimum1
{
    public int num1=60;
    public int min(int num)
    {
        return (num1+num);
    }
    public static void main(String[] args)
    {
        int num;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=inp.nextInt();

        minimum1 c1=new minimum1();

        System.out.println("The doubling of the number: "+ c1.min(num));
    }

}