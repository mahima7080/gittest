package oops;
class addition{
   private int a;
   private int b;
    void add(int x,int y)
    {
        a=x;
        b=y;
        System.out.println(a+b);
    }
   void additio(addition o)
    {
        System.out.println(o.a+o.b);
    }

}

public class Addition_two_no {
   static int a;
    public static void main(String[] args) {
        addition obj=new addition();
        obj.add(6,8);
       addition obj1= new addition();
       obj.add(4,1);
        System.out.println(a);

        addition obj3=obj;
        obj3.additio(obj3);

    }
}
