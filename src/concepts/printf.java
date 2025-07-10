package concepts;

public class printf {


    // %[specifier][.precision][flag][width]
    public static void main(String[] args) {
        int number=1200000;
        String str="mahima";

        int n=12;
        double a=10.456;
        char c='m';
boolean bo=true;
byte b=2;
long l=1234;
        System.out.printf("%.1f",a);
        System.out.printf("\n %d",number);
        System.out.printf("\n%s",str);
        System.out.printf("\n %c",c);
        System.out.printf("\n  %b",bo);
        System.out.printf("\n%d",b);
        System.out.printf("\n%d",l);
        System.out.printf("\n my name is %s and my weight is %f",str,a);

        System.out.printf("\n%05d",n);

        System.out.printf("\n%+d %% ",n);

        System.out.printf("\n %,d \u20B9",number);
        System.out.print(" \n \"  ");

        System.out.printf(" \n \" mahima \"");



        //important for interview
        int value=65;
        char ch=65;
        System.out.println((char)value);
        System.out.println(ch);

    }
}
