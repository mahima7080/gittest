package Task_Abt13x.task_3_july;


class multiply{
    int addition(int  a,int b)
    {
        return a+b;
    }
    int addition(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class multiply_overloading {
    public static void main(String[] args) {
        multiply m=new multiply();
        System.out.println(m.addition(2,8));
        System.out.println(
                m.addition(1,9,10)
        );
    }
}
