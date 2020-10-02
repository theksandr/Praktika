package PR4;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements EmployeePosition, Comparable
{
    public String name, surname, job;
    public double salary, baseSalary;
    Employee(){

    }

    Employee(String n, String su, String j, double bsa)
    {
        name=n;
        surname=su;
        job=j;
        baseSalary=bsa;
    }

    public boolean comparator(String nam, String sur)
    {
        if(nam.equals(this.name)&&sur.equals(this.surname))
            return true;
        else return false;
    }

    public String getJobTitle()
    {
        return job;
    }

   public double calcSalary(double baseSalary)
    {
        salary=baseSalary;
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public static final Comparator<Employee> COMPARE_BY_SALARY = new Comparator<Employee>(){
        @Override
        public int compare(Employee lhs, Employee rhs){
            return (int)lhs.getSalary() - (int)rhs.getSalary();
        }
    };

    @Override
    public String toString() {
        return  name +" "+ surname +" " + job+" " + baseSalary+" " + salary;
    }
}
