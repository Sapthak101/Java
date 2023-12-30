abstract class Student {
    int rollNo;
    int regNo;

    public Student(int rollNo, int regNo) 
    {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    public abstract void course();
}

class Kitian extends Student {
    public Kitian(int rollNo, int regNo) {
        super(rollNo, regNo);
    }

    public void course() {
        System.out.println("I am studying in KIIT, and I am majoring in Computer Science and Engineering");
        System.out.println("My roll number is: " +rollNo);
        System.out.println("My registration number is: " +regNo);
        System.out.println("I am majoring in: Computer Science and Engineering");
    }
}

public class Q1{
    public static void main(String[] args) {
        Kitian k = new Kitian(21053319, 9843718);
        k.course();
    }
}