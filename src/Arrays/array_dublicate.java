package Arrays;

public class array_dublicate {
    public static void main(String[] args) {
        int[] arr={1,7,9,1};
        int pos_i=0,pos_j=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j] &&i!=j)
                {
                    System.out.println("dublicate");
                    pos_j=j;
                    pos_i=i;
                }
            }
        }
        System.out.println(arr[pos_i]+ " "+arr[pos_j]);
    }
}
