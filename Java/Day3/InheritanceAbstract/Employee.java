package Java.Day3.InheritanceAbstract;

public abstract class Employee {
    protected int empid;
    protected String name;

    protected static int pt = 200;

    public Employee(int empid, String name){
        this.empid = empid;
        this.name = name;
    }

    abstract double calculateGross();

    public String toString(){
        return "empid=" + empid + ", name=" + name;
    }
    
    
}
