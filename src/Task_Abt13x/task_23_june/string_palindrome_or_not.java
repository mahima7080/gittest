package Task_Abt13x.task_23_june;

import java.util.Arrays;

public class string_palindrome_or_not {
    public static void main(String[] args) {
        String str="madam";
        char[] arr1=str.toCharArray();
        char[] aar2=new char[arr1.length];
       for (int i=arr1.length;i>0;i--)
       {
           aar2[arr1.length-i]=arr1[i-1];
       }
       if(Arrays.toString(arr1).equals(Arrays.toString(aar2)))
       {
           System.out.println("palindrome");
       }
       else {
           System.out.println("no palindrome");
       }
    }
}



