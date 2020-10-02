package PR4;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
public class Company
{
    ArrayList<Employee> UnemployedList;
    ArrayList<Employee> EmployeeList;
    public int income;
    Scanner scanner = new Scanner(System.in);
    Company()
    {
        income=(5000000+(int)(Math.random()*15000000));
        EmployeeList = new ArrayList<Employee>();
        UnemployedList = new ArrayList<Employee>();
    }
    public void employ()
    {
        String[] slog = new String[] {"kim", "chan", "sen", "jao", "pin", "zin", "lao", "van", "hu", "mao", "tze", "dun", "dju", "lei", "minj", "zen","tao","xin","chao","ning","fen"};
        for (int i=0;i<=180;i++)
        {
            String name = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            String surname = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            /*System.out.println(name+" "+surname);*/
            Operator operatornew = new Operator(name, surname, "Operator");
            UnemployedList.add(operatornew);
        }
        for (int i=0;i<=80;i++)
        {
            String name = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            String surname = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            /*System.out.println(name+" "+surname);*/
            Manager managernew = new Manager(name, surname, "Manager");
            managernew.salary+=0.05*((115000+Math.random()*25000));
            UnemployedList.add(managernew);
        }
        for (int i=0;i<=10;i++)
        {
            String name = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            String surname = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            /*System.out.println(name+" "+surname);*/
            TopManager topmanagernew = new TopManager(name, surname, "Top Manager");
            if (income>10000000) topmanagernew.salary+=1.5* topmanagernew.baseSalary;
            UnemployedList.add(topmanagernew);
        }
    }

    public void hireAll()
    {
        EmployeeList.addAll(UnemployedList);
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
            Operator operatornew = new Operator(n, su, j);
            operatornew.calcSalary(operatornew.baseSalary);
            EmployeeList.add(operatornew);
        }
        else if (cmd==2)
        {
            String n = scanner.nextLine();
            String su = scanner.nextLine();
            String j = "Manager";
            int sa = scanner.nextInt();
            Manager managernew = new Manager(n, su, j);
            managernew.calcSalary(managernew.baseSalary);
            managernew.salary+=0.05*((115000+Math.random()*25000));
            EmployeeList.add(managernew);
        }
        else if (cmd==3)
        {
            String n = scanner.nextLine();
            String su = scanner.nextLine();
            String j = "Top Manager";
            int sa = scanner.nextInt();
            TopManager topmanagernew = new TopManager(n, su, j);
            topmanagernew.calcSalary(topmanagernew.baseSalary);
            if (income>10000000) topmanagernew.salary+=1.5* topmanagernew.baseSalary;
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
        EmployeeList.forEach(obj -> {if(obj.comparator(nam, sur)) EmployeeList.remove(obj);} );
    }

    List<Employee> getTopSalaryStaff(int count)
    {
        List<Employee>TopSalaryList=null;
        if(count>EmployeeList.size()) System.out.println("Count is too big.");
        else if(count<0) System.out.println("Count can't be negative");
        else {
            Collections.sort(EmployeeList, Employee.COMPARE_BY_SALARY);
            TopSalaryList=EmployeeList.subList(0, count);
            }
        return TopSalaryList;
    }

    List<Employee> getLowestSalaryStaff(int count)
    {
        List<Employee>LowestSalaryList=null;
        if(count>EmployeeList.size()) System.out.println("Count is too big.");
        else if(count<0) System.out.println("Count can't be negative");
        else {
            Collections.sort(EmployeeList, Collections.reverseOrder(Employee.COMPARE_BY_SALARY));
            LowestSalaryList=EmployeeList.subList(0, count);
        }
        return LowestSalaryList;
    }

    public void printSalaryStaff(List<Employee> list) {
        for(int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i).getSalary());
    }
}
    public void fire50() {
        for (int i = 0; i < EmployeeList.size(); i += 2) {
            EmployeeList.remove(i);
        }
    }
    public int getIncome() {
        return income;
    }
    public void calcAll(){
        EmployeeList.forEach(obj -> obj.calcSalary(obj.baseSalary) );
    }
}
