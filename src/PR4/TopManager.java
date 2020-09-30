package PR4;

public class TopManager extends Employee implements EmployeePosition
{
    TopManager(String n, String su, String j, int sa)
    {
        name=n;
        surname=su;
        job="Top Manager";
        salary=sa;
    }
}
