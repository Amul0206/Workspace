package Java_Assignments.Assignment4;

public class UpperLowerSpecial {

    static int countUpper = 0;
    static int countLower = 0;
    static int countSpecial = 0;

    public static int UpperCount(String s){
        int len1 = s.length();

        for (int i=0; i<len1; i++){
            char [] myArray = s.toCharArray();
            int ascii = myArray[i];

            if (ascii>=65 && ascii<=90){
                countUpper+=1;
            }
        }

        return countUpper;
    }

    public static int LowerCount(String s){
        int len2 = s.length();

        for (int i=0; i<len2; i++){
            char [] myArray = s.toCharArray();
            int ascii = myArray[i];

            if (ascii>=97 && ascii<=122){
                countLower+=1;
            }
        }
        return countLower;
    }

    public static int SpecialCount(String s){
        int len3 = s.length();

        for (int i=0; i<len3; i++){
            char [] myArray = s.toCharArray();
            int ascii = myArray[i];

            if (ascii>=128 && ascii<=255){
                countSpecial+=1;
            }
        }
        return countSpecial;
    }

    public static void main(String[] args) {

        String s1 = new String("@#thYUB%");

        int TotalCount=0;

        countUpper = UpperCount(s1);
        countLower = LowerCount(s1);
        countSpecial = SpecialCount(s1);

        TotalCount = countUpper + countLower + countSpecial;

        System.out.println("TotalCount = " + TotalCount);

    }


}
