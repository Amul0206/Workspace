package Java.Day3.InheritanceInsurance;

public class Policy {
    public String displayInsurance(Vehicle v)
    {
        return Double.toString(v.calculateInsurance()) ;     

    }
}
