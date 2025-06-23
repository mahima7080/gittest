package stringss;

import java.util.Arrays;

public class sorted_string_builtin {
    public static void main(String[] args) {
        String str= "mahima lavi";
       char [] ch=str.toCharArray();
        Arrays.sort(ch);

       //String sorted=new String(ch);
      // System.out.println(sorted);
//
     //   //char[] c=ch;
     //   System.out.println(c);

        System.out.println(ch);
    }

}
