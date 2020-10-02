package PR4;

public class TopManager extends Employee implements EmployeePosition
{
    TopManager(String n, String su, String j)
    {
        name=n;
        surname=su;
        job="Top Manager";
        baseSalary=140000;
    }
    @Override
    public double calcSalary(double baseSalary) {
        this.salary=baseSalary+(Math.random()*60000);
        return salary;
    }
}
