package test_abt13x;
// Write a program to demonstrate type casting (both implicit and explicit).
public class question_4 {
    public static void main(String[] args) {
        int a=3;
        long l=a;//implicit
        System.out.println(l);
        double d=12.5;
        int n=(int)d;//explicit
        System.out.println(n);
    }
}
