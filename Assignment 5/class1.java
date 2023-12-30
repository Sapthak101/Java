import java.util.Scanner; //import keyword incorporates the specified class named as Scanner, and java is the main package under which the subpackage util resides, and under the subpackage the the class Scanner resides 

class demo
{
    private String name;
    private int age;
    private double salary;
    private char gender;

    public void getdata(String name1, int age1, double salary1, char gender1)
    {
        name=name1;
        age=age1;
        salary=salary1;
        gender=gender1;
    }
    public void datapreview()
    {
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your gender is: "+gender);
        System.out.println("Your salary is: "+salary);
    }
}

public class class1{ //public is the access specifier
    public static void main(String[] args){ //main a method member of the class class1, static is used to run the method without the creation of any objects and main the method name with args array of type string
        String name;
        int age;
        double salary;
        char gender;

        Scanner inp=new Scanner(System.in);

        System.out.println("Hi, there. I am Sapthak\n"); //System is the object of the class string

        System.out.println("Please enter your name: "); //System is an object of the class String
        name=inp.nextLine(); //inp is an object of the class Scanner 
        System.out.println("Please inter your age: ");
        age=inp.nextInt();
        System.out.println("Please mention your gender: ");
        gender=inp.next().charAt(0);
        System.out.println("Please enter your salary: ");
        salary=inp.nextDouble();

        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your gender is: "+gender);
        System.out.println("Your salary is: "+salary);

        demo d1=new demo();

        d1.getdata(name, age, salary, gender);
        d1.datapreview();
    }
}