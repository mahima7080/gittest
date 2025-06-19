package stringss;

import java.util.Scanner;

public class string_input {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        //s=sc.next(); // only one word
        s=sc.nextLine();// all line
        System.out.println(s);
    }
}
