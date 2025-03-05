package Java.Day6;

public class Stat <T extends Number>{
    T [] arr;

    public void setData(T[] arr){
        this.arr = arr;
    }

    public double calculateAverage(){
        double res = 0.0;
        for (int i=0; i<arr.length; i++){

            res+=arr[i].doubleValue();

        }
        return res/arr.length;
    }
    
    public static void main(String[] args) {

        Integer [] iarr = {1,2,3,4,5,6,7,8};
        Stat<Integer> iobj = new Stat<>();
        iobj.setData(iarr);
        System.out.println(iobj.calculateAverage());

        Double [] darr = {1.1, 2.1, 3.4, 5.6, 4.9, 6.7, 7.8, 8.9, 9.6};
        Stat <Double> dobj = new Stat<>();
        dobj.setData(darr);
        System.out.println(dobj.calculateAverage());
    }
}