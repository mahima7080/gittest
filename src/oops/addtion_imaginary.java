package oops;

import java.util.Scanner;

class  imaginary_add{
    private int a;
    private int b;

    String str="mahima";

     void showww(){
        System.out.println(str);
    }

    void get_data()
    {
        System.out.println("enter the value of and  b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void showdata(){
        System.out.println(a+ "+"+"i"+b);
    }
    void addition(imaginary_add o1,imaginary_add o2)
    {

        System.out.println((o1.a+o2.a)+"+"+"i"+ (o1.b+o2.b));
    }

}


public class addtion_imaginary {
    public static void main(String[] args) {
        imaginary_add ad=new imaginary_add();
        ad.get_data();
        ad.showdata();
        ad.showww();
        imaginary_add ad2=new imaginary_add();
        ad2.get_data();
        ad2.showdata();
         imaginary_add ad3=new imaginary_add();
         ad3.addition(ad,ad2);


    }
}
