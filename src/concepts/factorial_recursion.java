package concepts;

public class factorial_recursion {
    static int factorial(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else
            return n* factorial(n-1);
    }
    public static void main(String[] args) {
       int fact= factorial(3); // 3 * fact(2)
                                 //   3 * 2 * fact(1)
                                          //  3 * 2 * 1 * fact(0)
                                                //    3 * 2* 1* 1 =6
        System.out.println(fact);
    }
}
