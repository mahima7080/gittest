package concepts;

public class Recursion {
    static void decrement(int n)
    {

        if (n==0)
        {
            return;
        }
        n--;
        System.out.println(n);
        decrement(n);

    }
    public static void main(String[] args) {

      decrement(5);

    }
}
