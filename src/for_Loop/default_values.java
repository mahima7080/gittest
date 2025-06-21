package for_Loop;


public class default_values {
    static byte by;
static int a;
static short s;
    static long l;

static boolean b;
static char c;
 static float f;
static  double d;

//non primitive
  static   String str;
    public static void main(String[] args) {
        default_values d=new default_values();
        int a=1;
        System.out.println("local " + a);
        System.out.println("byte " + by);
        System.out.println(" int " +d.a);
        System.out.println("short " + d.s);
        System.out.println("long " + d.l);

        System.out.println("boolean " +d.b);

        System.out.println("char " + d.c);

        System.out.println("float " +d.f);
        System.out.println("double " +d.d);
        System.out.println(d);


        System.out.println(str);

    }
}
