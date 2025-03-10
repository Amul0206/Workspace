package Java.Day8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeStream {

    public static void main(String[] args) {
        EmployeeCollection collection=new EmployeeCollection();
        List<Employee> emplist=collection.initializedata();

        System.out.println("------------Sorting by name------------");
        Stream<Employee> stream=emplist.stream();
        Comparator<Employee> byName=Comparator.comparing(Employee::getName);
        stream.sorted(byName).forEach(System.out::println);

        System.out.println("------------Department wise sorted List------------");
        stream=emplist.stream();
        Comparator<Employee> byDept=Comparator.comparing(Employee::getDept).thenComparing(byname);
        stream.sorted(byDept).forEach(System.out::println);

        System.out.println("------------Employee - Department mapping------------");
        stream=emplist.stream();
        stream.map((emp)->new Department(emp.getId(), emp.getDept())).forEach(System.out::println);

        System.out.println("------------Grouping by Department------------");
        stream=emplist.stream();
        stream.collect(Collectors.groupingBy(Employee::getDept)).forEach((k,v)->System.out.println(k+" : "+v));

        System.out.println("------------Grouping bySalary------------");
        stream=emplist.stream();
        stream.filter((emp)->emp.getSalary()>60000).forEach(System.out::println);

        System.out.println("------------min/max/ave salary------------");
        stream=emplist.stream();
        Optional<Employee> min=stream.min(Comparator.comparing(Employee::getSalary));
        min.ifPresent(System.out::println);

        stream=emplist.stream();
        Optional<Employee> max=stream.max(Comparator.comparing(Employee::getSalary));
        max.ifPresent(System.out::println);

        stream=emplist.stream();
        OptionalDouble avg=stream.mapToDouble(Employee::getSalary).average();
        if(avg.isPresent())  System.out.println("Average salary: "+avg.getAsDouble());
    }
}
