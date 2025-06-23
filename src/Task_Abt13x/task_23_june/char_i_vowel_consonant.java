package Task_Abt13x.task_23_june;

import java.util.Scanner;

public class char_i_vowel_consonant {
    public static void main(String[] args) {
        String ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next();

        if (ch.length()!=1)
        {
            System.out.println("enter single char");
            return;
        }  ch=ch.toLowerCase();
        char c=ch.charAt(0);

        if (!Character.isLetter(c))
        {
            System.out.println("enter alphabet");
            return;
        }


        if (c=='a'||c=='e' ||c=='i'|| c=='o'||c=='u')
        {
            System.out.println("character is vowel");
        }
       /* else if(c>='0' && c<='9')
        {
            System.out.println("char is digit");
        }*/
        else
        {
            System.out.println("consonant");
        }

    }
}
