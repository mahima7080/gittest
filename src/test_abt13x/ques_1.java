package test_abt13x;
//  Write a Java program to declare variables of all primitive data types and print their default values.
public class ques_1 {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    public static void main(String[] args) {

        ques_1 q=new ques_1();
        System.out.println("byte default: " + q.b);
        System.out.println("short default: " + q.s);
        System.out.println("int default: " + q.i);
        System.out.println("long default: " + q.l);
        System.out.println("float default: " + q.f);
        System.out.println("double default: " + q.d);
        System.out.println("char default" + q.c);
        System.out.println("boolean default: " + q.bool);


    }
}
