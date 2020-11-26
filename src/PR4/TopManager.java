package PR4;

import java.util.Random;
public class TopManager implements EmployeePosition
{
    private double salary;
    private final Company company;
    /*TopManager(String n, String su, String j)
    {
        name=n;
        surname=su;
        job="Top Manager";
        baseSalary=140000;
    }*/
    public TopManager(Company company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getCompanyIncome() {
        return 0;
    }

    @Override
    public String getJobTitle() {
        return "Top-Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (company.getIncome() > 10000000) {
            return salary = Math.random()*baseSalary*2.5;
        } else {
            return salary = baseSalary;
        }
    }
}

