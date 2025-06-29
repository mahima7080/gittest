package stringss;

import java.util.Scanner;

public class String_arr {

    public static void main(String[] args) {
        String[] str = new String[3];
        Scanner sc = new Scanner(System.in);

int len=str.length;
        System.out.println(len);
        for (int i = 0; i <str.length; i++) {

            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] +" ");
            if(str[i].equals("5"))
            {
                System.out.println("5");

                System.out.println(i);
            }

        }


        sc.close(); // Best practice
    }
}
