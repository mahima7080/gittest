package Generics;

class add<T extends Number>
{
    T a,b;
    add(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    Double addition()
    {
       return a.doubleValue()+b.doubleValue();
    }
}
public class program2 {
    public static void main(String[] args) {
        add<Integer> a1=new add<>(1,4);


        add<Double> a2=new add<>(3.12,134.1);
        System.out.println( a1.addition().intValue());
        System.out.println(a2.addition());
    }
}
