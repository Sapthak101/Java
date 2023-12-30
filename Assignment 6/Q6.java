import java.util.Scanner;

public class Q3
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1=inp.nextInt();
        int num2=inp.nextInt();

        int array1[]=new int[100];
        int array2[]=new int[100];

        int temp=num1;
        int j=0;
        int count1=0;
        while(temp!=0)
        {
            array1[j++]=temp%10;
            temp=temp/10;
            count1++;
        }

        temp=num2;
        j=0;
        int count2=0;
        while(temp!=0)
        {
            array2[j++]=temp%10;
            temp=temp/10;
            count2++;
        }
        
        for (int i=0; i<count2; i++)
        {
            int k=0;
            if (array1[i]==array2[k++])
                System.out.println("Common digit found");
            i=0;
            
        }

    }
}