package Java.Day3.Enum;

import java.util.Scanner;

public class CookieStore {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter cookie type: CHOCOLATE/FIVESTAR/KITKAT: ");

        String type = sc.next();

        Cookie c = Cookie.valueOf(type.toUpperCase());

        System.out.println(c.getPrice());

        Cookie [] values = Cookie.values();
        for(Cookie c1 : values){
            System.out.println(c1);
        }
        sc.close();
    }
}
