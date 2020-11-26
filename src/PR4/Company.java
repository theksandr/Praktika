package PR4;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Company
{
    ArrayList<Employee> EmployeeList;
    public double income;
    Company()
    {
        EmployeeList = new ArrayList<Employee>();
    }

    /*public void hireAll(List<Employee> list)
    {
        EmployeeList.addAll(list);
    }*/


   /* public void hire()
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
    }*/

    public void hire(Employee employee) {
        if (EmployeeList == null) {
            EmployeeList = new ArrayList<Employee>();
        }
        EmployeeList.add(employee);
    }
    public void hireAll(ArrayList<Employee> employee) {
        if (EmployeeList == null) {
            EmployeeList = new ArrayList<Employee>();
        }
        EmployeeList.addAll(employee);
    }

    public void fire(int i)
    {
        //EmployeeList.forEach(obj -> {if(obj.comparator(nam, sur)) EmployeeList.remove(obj);} );
        EmployeeList.remove(i);
    }

   /* List<Employee> getTopSalaryStaff(int count)
    {
        List<Employee>TopSalaryList=null;
        if(count>EmployeeList.size()) count=EmployeeList.size();
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
        if(count>EmployeeList.size()) count=EmployeeList.size();
        else if(count<0) System.out.println("Count can't be negative");
        else {
            Collections.sort(EmployeeList, Collections.reverseOrder(Employee.COMPARE_BY_SALARY));
            LowestSalaryList=EmployeeList.subList(0, count);
        }
        return LowestSalaryList;
    }*/

    /*public void printSalaryStaff(List<Employee> list) {
        for(int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i).getSalary());
    }
}*/
    List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> highList= new ArrayList<Employee>();
        if (count < 0) {
            System.out.println("Count can't be negative");
            return highList;
        }
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.position.getSalary() < o2.position.getSalary()) {
                    return 1;
                }
                else if (o1.position.getSalary() > o2.position.getSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        EmployeeList.sort(comparator);
        for (int i = 0; i < count; i++) {
            highList.add(EmployeeList.get(i));
        }
        return highList;
    }

    List<Employee> getLowestSalaryStaff(int count) {

        ArrayList<Employee> lowList = new ArrayList<Employee>();
        if (count < 0) {
            System.out.println("Count can't be negative");
            return lowList;
        }
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.position.getSalary() < o2.position.getSalary()) {
                    return 1;
                }
                else if (o1.position.getSalary() > o2.position.getSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        EmployeeList.sort(comparator);
        Collections.reverse(EmployeeList);
        for (int i = 0; i < count; i++) {
            lowList.add(EmployeeList.get(i));
        }
        return lowList;
    }
    public List<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public double getIncome() {
        return income;
    }

    public double calcIncome() {
        income = 0;
        for (Employee employee : EmployeeList) {
            if (employee.position.getJobTitle().equals("Manager")) {
                income += employee.position.getCompanyIncome();
            }
        }
        return income;
    }

    public void calcAll(double baseSalary) {

        for (Employee employee : EmployeeList) {
            employee.position.calcSalary(baseSalary);
        }
    }
}
