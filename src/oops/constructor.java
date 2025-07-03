package oops;
class calculator{
    private int a ,b, c;

calculator(int a,int b,int c)
{
    this.a=a;
    this.b=b;
    this.c=c;
}
void display()
{
    System.out.println(a+""+b+""+c);
}
    calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int sum()
    {
        return a+b;
    }
    int subtraction()
    {
        return a-b;
    }
    calculator() //default constructor
    {
        System.out.println("dc");
    }
}
public class constructor {
    public static void main(String[] args) {
        calculator c=new calculator();
        calculator c1=new calculator(10,5);
        calculator c2=new calculator(9,5);
        calculator c3=new calculator(11,12,13);
       int summ= c1.sum();
       int sub=c1.subtraction();

       int summc2=c2.sum();
       int subc2=c2.subtraction();

        System.out.println(summ);
        System.out.println(sub);

        System.out.println();

        System.out.println(summc2);
        System.out.println(subc2);

        int sumc3=c3.sum();
        System.out.println(sumc3);
h.mahi();
        c3.display();
    }
}
