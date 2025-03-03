package Java.Day3.InheritanceAbstract;

public class ContractEmployee extends Employee {
    protected double hrs;
    protected double rate;
    
    public ContractEmployee(int empid, String name, double hrs, double rate){
        super(empid, name);
         this.hrs = hrs;
         this.rate =rate;

    }

    @Override
    double calculateGross() {
        // TODO Auto-generated method stub
        return hrs*rate;
    }

    public String toString(){
        return super.toString()+",Salary: " + this.calculateGross();
    }
}
