package concepts;

public class static_var {
    static int a;
    int instance_var=0;
    public static void main(String[] args) {
        static_var s=new static_var();
        static_var s2=new static_var();

        System.out.println(a);
        s.instance_var++;

        System.out.println(s.instance_var);
        System.out.println( s2.instance_var);
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);



    }
}
