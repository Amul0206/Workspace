package PRACTICE;

public class Palindrome {

    public static boolean IsPalindrome(String s){
        String n1 = s;
        String n2 = "";
        char ch;
        int len = n1.length();

        //Reverse the string
        for (int i = 0; i<len; i++){
            ch = n1.charAt(i);
            n2 = ch + n2;
        }

        if (n1.equals(n2)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
        String l = "racecar";
        if (IsPalindrome(l)){
            System.out.println(l + " is a palindrome.");
        }
    }
}
