package PR4;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class TestCompany {
    public static void main(String[] args)
    {
        Company company = new Company();
        ArrayList<Employee> UnemployedList;
        UnemployedList = new ArrayList<Employee>();

        String[] slog = new String[] {"kim", "chan", "sen", "jao", "pin", "zin", "lao", "van", "hu", "mao", "tze", "dun", "dju", "lei", "minj", "zen","tao","xin","chao","ning","fen"};
        for (int i=0;i<=180;i++)
        {
            String name = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            String surname = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            Employee employee = new Employee(name, surname, new Operator());
            UnemployedList.add(employee);
        }
        for (int i=0;i<=80;i++)
        {
            String name = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            String surname = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            Employee employee = new Employee(name, surname, new Manager());
            UnemployedList.add(employee);
        }
        for (int i=0;i<=10;i++)
        {
            String name = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            String surname = slog[(int)(20*Math.random())]+slog[(int)(20*Math.random())];
            Employee employee = new Employee(name, surname, new TopManager(company));
            UnemployedList.add(employee);
        }
        company.hireAll(UnemployedList);
        company.income=company.calcIncome();
        company.calcAll(20000+Math.random()*50000);

        System.out.println("Highest Salary staff:");
        List<Employee> highestList = company.getTopSalaryStaff(13);
        for (Employee item : highestList) {
            System.out.println(item.position.getSalary() + " " + item + "  " + item.position.getJobTitle());
        }
        System.out.println();
        System.out.println("Lowest Salary staff:");
        List<Employee> lowestList = company.getLowestSalaryStaff(30);
        for (Employee value : lowestList) {
            System.out.println(value.position.getSalary() + " " + value + "  " + value.position.getJobTitle());
        }
        System.out.println();

        for (int i = 0; i < company.EmployeeList.size(); i += 2) {
            company.fire(i);
        }
        System.out.println("Highest Salary staff:");
        highestList = company.getTopSalaryStaff(13);
        for (Employee item : highestList) {
            System.out.println(item.position.getSalary() + " " + item + "  " + item.position.getJobTitle());
        }
        System.out.println();
        System.out.println("Lowest Salary staff:");
        lowestList = company.getLowestSalaryStaff(30);
        for (Employee value : lowestList) {
            System.out.println(value.position.getSalary() + " " + value + "  " + value.position.getJobTitle());
        }
    }
}
