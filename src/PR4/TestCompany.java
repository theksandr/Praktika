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
        company.employ();
        company.hireAll();
        company.calcAll();
        company.printSalaryStaff(company.getTopSalaryStaff(13));
        System.out.println();
        company.printSalaryStaff(company.getLowestSalaryStaff(30));
        System.out.println();
        company.fire50();
        company.printSalaryStaff(company.getTopSalaryStaff(13));
        System.out.println();
        company.printSalaryStaff(company.getLowestSalaryStaff(30));
    }
}
