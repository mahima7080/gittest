package Generics;

public class program1 {
    public static void main(String[] args) {
       Integer result = sum(1,2).intValue();
       Double d=sum(12.3,23.1);
        System.out.println(result);
        System.out.println(d);
   }//Number is a built-in abstract class in Java from java.lang package.
   // It is the superclass of all numeric wrapper classes


   // This approach uses type checking + casting — which isn't pure generics but is a practical workaround in Java.
    static <T extends Number> Double sum(T a, T b)
    {
        return a.doubleValue()+ b.doubleValue();
    }
}
