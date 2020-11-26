package PR4;
import java.util.Comparator;

public class Employee {
    protected String name, surname;
    /*public double salary, baseSalary;*/
    protected EmployeePosition position;

    Employee(String n, String su, EmployeePosition pos)
    {
        name=n;
        surname=su;
        position=pos;
    }

   /* public boolean comparator(String nam, String sur)
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
    };*/

    @Override
    public String toString() {
        return  name +" "+ surname ;
    }
}
