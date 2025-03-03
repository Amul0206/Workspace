package Java.Day4.ObjectsEqualsHashcode;

public class ObjectMethods {
    public static void main(String[] args) {

        Car c1=new Car("Honda", "City", 10);
        Car c2=new Car("Honda", "City", 10);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        if(c1.equals(c2)){
            System.out.println("Cars are equal");
        }
    }
}