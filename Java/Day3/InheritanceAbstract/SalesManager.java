package Java.Day3.InheritanceAbstract;

public class SalesManager extends Manager{
    protected static double incentive = 500;

public SalesManager(int empid,  String name, double basic){
    super(empid, name, basic);

    }

@Override
protected double calculateNet() {
    // TODO Auto-generated method stub

    return super.calculateNet() + incentive;
}
        
public String toString(){
    return super.toString()+",Incentive: " + incentive;
}    
}