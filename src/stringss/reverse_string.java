package stringss;

public class reverse_string {
    public static void main(String[] args) {
        String s="lavi shanu mummy";

        char [] arr=s.toCharArray();
        int len=arr.length;
        char temp;
        System.out.println(len);
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                   // if(arr[i]>arr[j])

                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;


            }
        }
        String reverse = new String(arr);//  Convert sorted char array back to string
        System.out.println("reverse string: " + reverse);
    }
}
