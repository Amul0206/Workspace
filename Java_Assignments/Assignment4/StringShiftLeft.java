package Java_Assignments.Assignment4;

public class StringShiftLeft {

    static String shiftLeft(String s){
        return s.substring(1)+s.charAt(0);
    }

    static String shiftLeftBy(String s, int offset){
        for(int i=0;i<offset;i++) s=shiftLeft(s);
        return s;
    }

    public static void main(String[] args) {
        String s="Artificial Intelligence";
        int offset=3;

        System.out.println("Original String: " + s);
        System.out.println("String after shifting by 1 place " + shiftLeft(s));
        System.out.println("String after shifting by " + offset + " places is = " + shiftLeftBy(s,offset));
    }
}
