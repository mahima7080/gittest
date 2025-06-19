import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);

        s=sc.nextLine();

        int len=s.length();
       // System.out.println(len);
        int count_vowel=0;
        int count_constant=0;
s=s.toLowerCase();
if (s.isEmpty())
{
    System.out.println("enter something");
}
else
{
        for(int i=0;i<len;i++)
        {
          if(s.charAt(i)=='i'||s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='o' ||s.charAt(i)=='u')
          {

              count_vowel++;
          }

          else if(s.charAt(i)>='a' && s.charAt(i)<='z')
          {
              count_constant++;
          }
          else
          {
              System.out.println(" invalid character");
              break;
          }
        }
        System.out.println(count_vowel);
        System.out.println(count_constant);
    }
    }

}
