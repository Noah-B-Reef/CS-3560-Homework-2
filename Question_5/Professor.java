package Question_5;

public class Professor extends Employee{
    private int hours;
    private String field;
    
    public Professor(String name, int hours, String field)
    {
        super(name, hours);
        this.field = field;
    }

    public double calculateSalary()
    {
        return hours*30;
    }
}
