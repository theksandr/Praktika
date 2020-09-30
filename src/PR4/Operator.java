package PR4;

public class Operator extends Employee implements EmployeePosition
{
    Operator(String n, String su, String j, int sa)
    {
        name=n;
        surname=su;
        job="Operator";
        salary=sa;
    }
}
