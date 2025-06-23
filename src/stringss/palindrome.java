package stringss;

public class palindrome {
    public static void main(String[] args) {
        String str="nitin";
        str.length();
        char[] arr=str.toCharArray();
        char[] aar2=new char[arr.length];
        int flag=0;
        for (int i=arr.length;i>0;i--)
        {
            aar2[arr.length-i]=arr[i-1];
            if(aar2[arr.length-i]!=arr[arr.length-i]){
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(" no palindrome");
        }
        else {
            System.out.println("palindrome");
        }
    }
}
