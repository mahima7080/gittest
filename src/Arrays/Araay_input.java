package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Araay_input {
    public static void main(String[] args) {
        System.out.println("enter the no of element");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        int len=arr.length;//length is field ......length and n is same here
        System.out.println(len);
        System.out.println("enter the elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       // System.out.println(arr);//it returns the address of array;
          for(int i=0;i<n;i++)
          {
              for (int j=i+1;j<n;j++)
              {
                  if(arr[i]>arr[j])
                  {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  }
              }
          }

        String s= Arrays.toString(arr);
          System.out.println(s);


    }

}
