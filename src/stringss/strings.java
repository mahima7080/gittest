package stringss;

public class strings {
    public static void main(String[] args) {
        String s1="Mahima ";
        String s2="srivastava ";
        String s4="mahima";
        String s3="mahima";
      //  String total= s1 + " " + s2;
      //  System.out.println(total);

        System.out.println( s1.concat(s2));
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1,3));
        System.out.println(s2.toUpperCase());
        System.out.println(s2.compareTo(s4));
        System.out.println(s1.equals(s2));
       // System.out.println(s1.);
      //  System.out.println(s1==s2);
        System.out.println(10 + 20 + "Hello");
        System.out.println(5/2);
        int x = 10;
        if (x > 5)
            System.out.println("Greater");
        System.out.println("Always printed");
        x=15;
        if (x > 20)
            System.out.println("A");
        else if (x > 10)
            System.out.println("B");
        else
            System.out.println("C");

        int i = 0;
        while (i < 3) {
            System.out.print(i + " ");
            i++;
        }



    }
}
