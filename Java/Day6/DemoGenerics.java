package Java.Day6;

public class DemoGenerics <T> {
    T obj ; 

    public void setData(T obj){
        this.obj = obj;
    }

    public String getName(){
        //obj--->Any valid Object in Java.
        //Used to provide type safety.
        return obj.getClass().getName();
    }

    public static void main(String[] args) {

        DemoGenerics<Integer> integerObj1 = new DemoGenerics<>();
        integerObj1.setData(450);
        System.out.println(integerObj1.getName());

        DemoGenerics<String> stringObj2 = new DemoGenerics<>();
        stringObj2.setData("ABC");
        System.out.println(stringObj2.getName());

    }
}