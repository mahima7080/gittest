package Arrays;

public class imp {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,10};
        int real_sum=55;
        int sum=0;
        for (int i:arr)
        {
            sum=sum+i;
        }
        int miss_no=real_sum-sum;
        System.out.println(miss_no);
    }
}
