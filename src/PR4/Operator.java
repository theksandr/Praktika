package PR4;

public class Operator implements EmployeePosition
{
    private double salary;
    /*Operator(String n, String su, String j)
    {
        name=n;
        surname=su;
        job="Operator";
        baseSalary=30000;
    }*/

    public double getSalary() {
        return salary;
    }

    @Override
    public double getCompanyIncome() {
        return 0;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return salary = Math.random()*baseSalary;
    }

}

