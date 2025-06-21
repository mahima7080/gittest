package concepts;

public class typecasting {
    public static void main(String[] args) {
        int a =12;
        double d=a;
        System.out.println(d);//implicit(widening)
       // System.out.println((double) a);
        double k=12.34252;
        int p=(int) k;//explicit(narrowing)
        System.out.println(p);
    }
}

