package concepts;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int age;
        boolean is_adult=false;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18)
        {
           is_adult=true;
        }
        if (is_adult)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println(" not adult");
        }
    }
}
