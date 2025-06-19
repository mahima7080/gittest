package stringss;

public class string_iteration {
    public static void main(String[] args) {
        String s="mahima";
        System.out.println(s.length());
for(int i=0;i<s.length();i++)
{
    //System.out.println(s.charAt(i));
    if(s.charAt(i)=='m')
    {
        System.out.println("hi");
    }
    else
    {
        System.out.println("bye");
    }
}


    }

}
