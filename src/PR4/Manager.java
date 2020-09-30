package PR4;

public class Manager extends Employee implements EmployeePosition
{
    Manager(String n, String su, String j, int sa)
    {
        name=n;
        surname=su;
        job="Manager";
        salary=sa;
    }
}
