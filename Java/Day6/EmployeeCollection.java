package Java.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeCollection {
    public List<Employee> InitializeData(){

        List<Employee> emplist = new ArrayList<>();

        Set<String> skills1 = new TreeSet<>();
        skills1.add("C");
        skills1.add("C++");
        skills1.add("Linux");

        Employee e1 = new Employee(445, "ppp", 80000, skills1);

        Set<String> skills2 = new TreeSet<>();
        skills2.add("C++");
        skills2.add("C#");
        skills2.add("PHP");

        Employee e2 = new Employee(450, "qqq", 90000, skills2);

        Set<String> skills3 = new TreeSet<>();
        skills2.add("ASP.net");
        skills2.add("C#");
        skills2.add("PHP");

        Employee e3 = new Employee(455, "rrr", 50000, skills3);

        Set<String> skills4 = new TreeSet<>();
        skills2.add("ASP.net");
        skills2.add("HTML");
        skills2.add("PHP");

        Employee e4 = new Employee(460, "sss", 60000, skills4);

        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        emplist.add(e4);
                return emplist;

        // public void printData(List<Employee> emplist){
        //     for(Employee e : emplist){

        //     }
        // }

        }
    
        public List<Employee> filterBySkill(List<Employee> emplist, String skill){
            List <Employee> filtered = new ArrayList<>();
            for (Employee e : emplist){
                if(e.getSkills().contains(skill)){
                    filtered.add(e);
                }
            }
            return filtered;
        }

        public Map<String, Double> salaryMap(List<Employee> emplist){
            Map<String, Double> salmap = new TreeMap<>();
            for(Employee e : emplist){
                salmap.put(e.getName(), e.getSalary());
            }
            return salmap;
        }

    public List<Employee> sortByEmpid(List<Employee> emplist) {

        throw new UnsupportedOperationException("Unimplemented method 'sortByEmpid'");
    }

    public void printData(List<Employee> sorted) {

        throw new UnsupportedOperationException("Unimplemented method 'printData'");
    }

    public Map<String, Double> getEmployeeSalary(List<Employee> emplist) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeSalary'");
    }
}