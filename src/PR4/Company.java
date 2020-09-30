package PR4;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
public class Company
{
    List<Employee>EmployeeList;
    public int income;
    Scanner scanner = new Scanner(System.in);
    Company()
    {
        income=(5000000+(int)(Math.random()*15000000));
        //EmployeeList=new List<Employee>();
    }

    public void hire()
    {
        int cmd;
        System.out.println("Who do you want to hire?\n1.Operator\n2.Manager\n3.Top Manager");
        cmd = scanner.nextInt();
        if (cmd==1)
        {
            String n = scanner.nextLine();
            String su = scanner.nextLine();
            String j = "Operator";
            int sa = scanner.nextInt();
            Employee operatornew = new Employee(n, su, j, sa);
            EmployeeList.add(operatornew);
        }
        else if (cmd==2)
        {
            String n = scanner.nextLine();
            String su = scanner.nextLine();
            String j = "Manager";
            int sa = scanner.nextInt();
            Employee managernew = new Employee(n, su, j, sa+(int)(0.05*(115000+(int)(Math.random()*25000))));
            EmployeeList.add(managernew);
        }
        else if (cmd==3)
        {
            String n = scanner.nextLine();
            String su = scanner.nextLine();
            String j = "Top Manager";
            int sa = scanner.nextInt();
            Employee topmanagernew = new Employee(n, su, j, sa);
            if (income>10000000) topmanagernew.salary+=1.5*sa;
            EmployeeList.add(topmanagernew);
        }
    }

    public void fire()
    {
        int cmd;
        String nam, sur;
        System.out.println("Who do you want to fire?");
        System.out.println("Type in an employee you want to fire.");
        nam = scanner.nextLine();
        sur = scanner.nextLine();
        EmployeeList.forEach(obj -> {if(obj.comparator()) EmployeeList.remove(obj);} );
    }

    public int getIncome() {
        return income;
    }
}
