import java.util.Scanner;

class Student {
    int rollno;
    String course;

    public void register(String c1) {
        course = c1;
        System.out.println("Roll No.: "+rollno);
        System.out.println("Enrolled in: "+course);
    }
}

class Kiitian extends Student {
    public void hostel_Request() {
        System.out.println("Sir, kindly allot my hostel accomodation!");
    }
}

public class Q1{
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        Scanner inp= new Scanner(System.in);

        System.out.println("Enter Rollno: ");
        int roll=inp.nextInt();

        k.rollno = roll;
        k.register("Computer Science and Engineering");
        k.hostel_Request();
    }
}