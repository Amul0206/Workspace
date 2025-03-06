package Java.Day7;

public class ExceptionLambda {

    public static String OperateOnString(StringFunction func, String s) throws EmptyStringException {

        if(s.equals("")){
            throw new EmptyStringException("Empty String");
        }
        else{
            System.out.println(func.apply(s));
        }
                return s;
    }

    public static void main(String[] args) {
        
        String s = "Hello World";

        try{
            OperateOnString((str)->str.toLowerCase(), s);
        }
        catch(EmptyStringException e){
            e.printStackTrace();
        }
        
        try{
            String lower = OperateOnString(String:: toLowerCase, s);
            System.out.println(lower);
        }
        catch(EmptyStringException e){
            e.printStackTrace();
        }
    }
}