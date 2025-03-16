package Java_Assignments.Assignment3.Q2;

public class Policy implements Printable {
    private int policyNumber;
    private String policyHolder;
    private String policyStartDate;
    private int policyAmount;
    private int period;

    public Policy(int policyNumber, String policyHolder, String policyStartDate, int policyAmount, int period) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.policyStartDate = policyStartDate;
        this.policyAmount = policyAmount;
        this.period = period;
    }

    @Override
    public void print() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder: " + policyHolder);
        System.out.println("Policy Start Date: " + policyStartDate);
        System.out.println("Policy Amount: " + policyAmount);
        System.out.println("Period: " + period);
    }
}
