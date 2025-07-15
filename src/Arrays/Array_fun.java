package Arrays;

import java.util.Scanner;

public class Array_fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayDisplay(arr);
    }
  static void ArrayDisplay(int[] a)
   {
       for (int i:a)//it is advanced for each loop
       {
           System.out.println(i);
       }
   }
}
