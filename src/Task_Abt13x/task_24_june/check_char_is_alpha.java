package Task_Abt13x.task_24_june;

import java.util.Scanner;

public class check_char_is_alpha {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
                str=scanner.next();
                Boolean  is_char=false;
                if (str.length()!=1)
                {
                    System.out.println("enter a single char &");
                    return;
                }
        char ch=str.charAt(0);
                if (Character.isLetter(ch))
                {
                    is_char=true;
                }
                if (is_char)
                {
                    System.out.println("char is alpha");
                }
                else {
                    System.out.println("not a alphabet");
                }
    }
}
