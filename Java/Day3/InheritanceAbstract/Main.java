package Java.Day3.InheritanceAbstract;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee o1=new SalesManager(1,"Amit",1200000);
        Employee o2=new ContractEmployee(2, "Harsh", 2, 500);
        Payroll p=new Payroll();
        p.displayNet(o1);
        p.displayGross(o2);
    }
   
}
