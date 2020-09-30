package PR4;

public class Employee implements EmployeePosition
{
    public String name, surname, job;
    public int salary;
    public Company Company1;
    Employee(){

    };

    Employee(String n, String su, String j, int sa)
    {
        name=n;
        surname=su;
        job=j;
        salary=sa;
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
        return salary;
    }

}
