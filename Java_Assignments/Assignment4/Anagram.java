package Java_Assignments.Assignment4;

import java.util.Arrays;

public class Anagram {

    public static boolean  IsAnagram(String s1, String s2){
        byte [] byte1 = s1.getBytes();
        byte [] byte2 = s2.getBytes();

        Arrays.sort(byte1);
        Arrays.sort(byte2);
        
        int len = byte1.length;

        for (int i=0; i<len; i++){
            if (byte1[i] != byte2[i]){
                return false;
            }  
        }
        return true;

    }

    public static void main(String[] args) {

        String s1 = new String("Amit");
        String s2 = new String("mitA");

        boolean test = IsAnagram(s1, s2);

        if (test) System.out.println(s1 + " and " + s2 + " are anagrams.");

        System.out.println(s1);
        System.out.println(s2);
    }
}
