package Java.Day6;

import java.util.Collections;
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
        int found = Collections.binarySearch(sorted, new Employee(0, "", 0, null));
        System.out.println("Employee found at index: " + found);
        
        System.out.println("-----Sort by name----");
        Collections.sort(emplist, new NameComparator());
        collection.printData(emplist);
        int found1 = Collections.binarySearch(emplist, new Employee(0, "rrr", 0, null), new NameComparator());
        System.out.println("Employee found at index: " + found1);

        System.out.println("-----Sort by salary----");
        Collections.sort(null, new SalaryComparator());
        collection.printData(emplist);
        int found2 = Collections.binarySearch(emplist, new Employee(0, "", 50000, null), new SalaryComparator());
        System.out.println("Employee found at index: " + found2);
    }
}