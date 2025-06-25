package Task_Abt13x.task_25_june;

public class second_largest_elment_array {
    public static void main(String[] args) {
        int[] arr={12,78,34,10,16};
        int largest=arr[0],pos=0,second_largest;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
                pos=i;

            }
        }
        System.out.println("largest "+largest);
        second_largest=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (pos!=i)
            {
                if (arr[i]>second_largest)
                {
                    second_largest=arr[i];
                }
            }
        }
        System.out.println("second largest "+ second_largest);
    }
}
