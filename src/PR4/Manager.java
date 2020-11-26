package PR4;

import java.util.Random;
public class Manager implements EmployeePosition
{
    private double salary, companyIncome;
    /*Manager(String n, String su, String j)
    {
        name=n;
        surname=su;
        job="Manager";
        baseSalary=70000;
    }*/
    public Manager()
    {
        Random r = new Random();
        companyIncome = (r.nextInt(25000) + 115000);
    }

    public double getSalary() {
        return salary;
    }

    public double getCompanyIncome() {
        return companyIncome;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {

        return salary =  companyIncome*0.05 + Math.random()*baseSalary;
    }

}

