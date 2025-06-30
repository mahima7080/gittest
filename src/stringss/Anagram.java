package stringss;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        char[] str1={'m','a','h','i','k','p'};
        char[] str2={'m','a','i','h','a','k'};
        boolean b=true;

        int l1=str1.length;
        int l2=str2.length;
        if(l1!=l2)
        {
            System.out.println("not anagram");
            return;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i]!=str2[i]){
                b=false;
                break;
            }

        }
        if(b)
        {
            System.out.println("it is anagram");
        }
        else
        {
            System.out.println("it is not");
        }

    }
}
