package stringss;

public class rev_str_using_string {
    public static void main(String[] args) {
        String name="madam";
        String rev="";
        for (int i=name.length();
             i>0;i--)
        {
            rev=rev+name.charAt(i-1);
        }
        System.out.println(rev);
        if (name.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
