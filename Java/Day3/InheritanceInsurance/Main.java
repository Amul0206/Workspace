package Java.Day3.InheritanceInsurance;

public class Main {
    public static void main(String[] args) {
        TwoWheeler t1 = new TwoWheeler(123, "XYZ", "PQR", 25000);
        Policy p1 = new Policy();
        System.out.println(p1.displayInsurance(t1));
    }

}
