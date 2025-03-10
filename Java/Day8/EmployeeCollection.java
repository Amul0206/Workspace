package Java.Day8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {

    public List<Employee> initializedata(){
        List<Employee> emplist=new ArrayList<>();

        Employee e1= new Employee(445,"ppp", 50000,"11");
        Employee e2= new Employee(446,"qqq", 60000,"22");
        Employee e3= new Employee(447,"rrr", 70000,"33");
        Employee e4= new Employee(448,"sss", 80000,"44");
        Employee e5= new Employee(449,"ttt", 90000,"55");
        Employee e6= new Employee(450,"uuu", 100000,"66");
    
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        emplist.add(e4);
        emplist.add(e5);
        emplist.add(e6);
    
        return emplist;

    }
}
