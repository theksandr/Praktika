package PR4;

public class Operator extends Employee implements EmployeePosition
{
    Operator(String n, String su, String j)
    {
        name=n;
        surname=su;
        job="Operator";
        baseSalary=30000;
    }

    @Override
    public double calcSalary(double baseSalary) {
        this.salary=baseSalary+(Math.random()*30000);
        return salary;
    }
}
