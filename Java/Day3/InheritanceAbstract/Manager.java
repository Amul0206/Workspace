package Java.Day3.InheritanceAbstract;

public class Manager extends SalariedEmployee {
    protected static double allowance = 5000;

    public Manager(int empid, String name, double basic){
        super(empid, name, basic);

    }

    @Override
    protected double calculateNet() {
        // TODO Auto-generated method stub
        
        return super.calculateNet() + allowance;
    }
    public String toString(){
        return super.toString()+",Allowance: " + allowance;
    }
    protected void displayAllowance(){
        System.out.println(allowance);
    }
    

}
