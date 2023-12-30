interface Motor {
    final int capacity = 500;

    public void run();

    public void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("The washing machine is funtioning.");
    }

    public void consume() 
    {
        System.out.println("The washing is consumming electricity");
    }
}

public class Q2 
{
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("The capacity of the washing machine is " + wm.capacity + " litres.");
    }
}