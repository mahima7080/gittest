package stringss;

public class equality_operator {
    public static void main(String[] args) {
        String s1="mahi";
        String s2="mahi";
        String s3="sanu";
        System.out.println(s1==s2);//memory mangement// compares references // equality operator
        System.out.println(s2==s3);

        String str=new String("hello");
        String str2=new String("hello");//it compares two object(2 diiferent memory location/ reference) despite having same value they are not equal
        System.out.println(str==str2);
    }
}
