package List.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        String str="Hello world";
       String[] s= str.split(" ");
       String reverse="";
       for(int i=s.length-1;i>=0;i--)
       {
           reverse=reverse+s[i];
           if (i!=0)//when you need no extra space after hello
           {
               reverse=reverse+" ";
           }
       }
        System.out.println(reverse);
    }
}
