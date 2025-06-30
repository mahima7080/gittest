package Arrays;

public class linear_search {
    public static void main(String[] args) {
        int [] arr={1,9,2,10,14};
        int t=10,pos=0;
        boolean found=false;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==t)
            {
                found=true;
                pos=i;
                break;
            }
        }
        if (found)
        {
            System.out.println("value found at "+ (pos+1) + "value is" + arr[pos]);
        }
        else
        {
            System.out.println("not found");
        }
    }
}
