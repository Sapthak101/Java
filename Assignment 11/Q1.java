
public class q1 {
    public static void main(String[] args) {
        int basicSalary = 10000;
        int empId = 001;
        Sales emp = new sales();
        double earnings = emp.earnings(basicSalary);
        double allowance = emp.allowance(earnings);
        System.out.println("Emp Id: " + empId);
        System.out.println("Earnings: " + earnings);
        System.out.println("Allowance: " + allowance);
    }

}
