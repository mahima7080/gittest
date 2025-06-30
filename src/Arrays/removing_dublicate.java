package Arrays;

import java.util.Scanner;

public class removing_dublicate {
    public static void main(String[] args) {
        int[] arr=new int[5];
                int pos=0,i;

        Scanner sc=new Scanner(System.in);
        for ( i=0;i<arr.length;i++)
        {

                arr[i]=sc.nextInt();
        }
        boolean flag =false;
        for ( i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]&&i!=j)
                {
                    flag=true;  pos=i;
                    System.out.println("found"+ pos);

                }
            }
            if(!flag){
            int[] arr2=new int[arr.length];
            for ( i=0;i<arr2.length;i++) {
                arr2[i]=arr[i];
                System.out.println(arr2[i]);

            }}
        }



    }
}
