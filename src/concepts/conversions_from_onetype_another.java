package concepts;

public class conversions_from_onetype_another {
    public static void main(String[] args) {
        int num=534;
        String s=String.valueOf(num);
        System.out.println(s);
        System.out.println(s.length());
      int k=Integer.parseInt(s);
        System.out.println(k);
//############################################### conversion from string to character//
        String c="hi";
        char ch=c.charAt(0);
        System.out.println(ch);

    }
}
