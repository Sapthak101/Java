package WT_LAB.Lab11.General;

public class employee
{
    protected int empId;
    private String empName;

    public int earnings(int basic)
    {
        int earnings = basic + (0.8 * basic) + (0.15 * basic); 
        return earnings; 
    }
}
