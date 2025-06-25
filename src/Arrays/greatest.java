package Arrays;

public class greatest {
    public static void main(String[] args) {
        int[] arr={12,78,34,10,16};
        int largest=arr[0],pos=0,second_lagest;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
                pos=i;

            }
        }
        System.out.println(largest);
        second_lagest=arr[0];
       for (int i=0;i<arr.length;i++)
       {
           if (pos!=i)
           {
               if (arr[i]>second_lagest)
               {
                   second_lagest=arr[i];
               }
           }
       }
        System.out.println(second_lagest);
    }
}
