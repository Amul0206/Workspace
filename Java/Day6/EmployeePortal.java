package Java.Day6;

import java.util.List;
import java.util.Map;
import java.lang.String;

public class EmployeePortal {
    public static void main(String[] args) {
        EmployeeCollection collection = new EmployeeCollection();
        List<Employee> emplist = collection.InitializeData();
        collection.printData(emplist);

        System.out.println("-----Filter by Skill------");
        List<Employee> filtered = collection.filterBySkill(emplist, "C++");
        collection.printData(filtered);

        System.out.println("-----Salary Map----");
        Map<String, Double> salmap = collection.getEmployeeSalary(emplist);
        for (String k : salmap.keySet()) {
            System.out.println(k + " -> " + salmap.get(k));
        }

        System.out.println("-----Sort by empid----");
        List<Employee> sorted = collection.sortByEmpid(emplist);
        collection.printData(sorted);
    }
}