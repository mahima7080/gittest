package stringss;

public class sorted_string {
    public static void main(String[] args) {
         String s= "Mahima";
         s=s.toLowerCase();
        char [] arr= s.toCharArray();
        int len =arr.length;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}
            }
        }
        String str=new String(arr);
        System.out.println(str);


    }
}
