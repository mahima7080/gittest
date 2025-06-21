package concepts;

public class campareTo {

    public static void main(String[] args) {
        String s1="mi";
        String  s2="hi";
        System.out.println(s1.compareTo(s2));
        if (s1.compareTo(s2)==0)
        {
            System.out.println("both are equal");
        }
        else if (s1.compareTo(s2)>0)
        {
            System.out.println(" s1 is greater to s2");
        }
        else
        {
            System.out.println(" s1 is smaller to s2");
        }
    }
}
