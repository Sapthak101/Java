public class Q1{
    public static void main(String data[])
    {
        int num;
        System.out.println("Enter the number of number you want to enter: ");
        num= Integer.parseInt(data[0]);

        int array1[]=new int[100];
        int sum=0;

        for (int i=1; i<=num; i++)
        {
            array1[i]=Integer.parseInt(data[i]);
            sum=sum+array1[i];
        }
        System.out.println("The average is: "+((float)sum/num));
    }
}