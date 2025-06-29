package stringss;
import  java.util.Arrays;
public class string_array {
    public static void main(String[] args) {

        String[] str=new String[2];

        str[0]="mahima";
        char[] carr=str[0].toCharArray();
        Arrays.sort(carr);
        str[0] =new String(carr);

        str[1]="sanu";
        System.out.println(str[0]);
        System.out.println(str[1]);

    }
}
