package Java.Day3.InheritanceAbstract;

public class Payroll {
    public void displayGross(Employee e){
        System.out.println("Gross salary for the month: "+e.calculateGross());
    }

    public void displayNet(SalariedEmployee e){
        System.out.println("Net salary for the month: "+e.calculateNet());
    }
    
}
