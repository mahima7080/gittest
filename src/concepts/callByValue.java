package concepts;

public class callByValue {
/**
 * java supports  only call by value.....
 *int  x is a copy of int  a ;
 *
 * it does not affect the original value of a and b
 *

 */
     static void increment(int x, int y )
    {
       x++;
       y++;
        System.out.println(x);
        System.out.println(y);;
    }
    public static void main(String[] args) {
        int a=4,b=5;
        increment(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
