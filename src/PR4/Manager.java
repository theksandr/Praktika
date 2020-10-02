package PR4;

public class Manager extends Employee implements EmployeePosition
{
    Manager(String n, String su, String j)
    {
        name=n;
        surname=su;
        job="Manager";
        baseSalary=70000;
    }

    @Override
    public double calcSalary(double baseSalary) {
        this.salary=baseSalary+(Math.random()*40000);
        return salary;
    }
}
