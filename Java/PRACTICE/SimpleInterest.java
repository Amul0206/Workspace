package PRACTICE;

public class SimpleInterest {
    public float p;
    public int n;
    protected float roi;

    public float getP() {
        return p;
    }
    
    public int getN() {
        return n;
    }

   
    public float getRoi() {
        return roi;
    }
 

    public SimpleInterest(float p, int n, float r){
        this.p = p;
        this.n = n;
        this.roi = r;
    }

    public float CalculateInterest(){
        float si;
        si = (p*n*roi)/100;

        return si;
    }

    
    //MAIN METHOD

    public static void main(String[] args) {
        SimpleInterest s1 = new SimpleInterest(10000, 5, 9);
        System.out.println("Principal: " + s1.getP() + " NumberOfYears: " + s1.getN() + " RateofInterest: " + s1.getRoi());
        System.out.println(s1.CalculateInterest());
    }
}
