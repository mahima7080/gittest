package Super;
class parent{
    int a;
    String str;
    void show()
    {
        System.out.println(a+str);
        System.out.println("hiiii show() parent");
    }
    parent(int a,String str)
    {
        this.a=a;
        this.str=str;
    }
    parent()
    { this(10,"parent");
        System.out.println("parent default constructor");
    }
}
class child extends parent
{
    int a;
    String str;

    void show()
    {
        System.out.println("hiiii show() child");

        System.out.println(a+str);
    }

    child(int a, String str)
    {super();
        this.a=a;
        this.str=str;
    }
child()
{
    this(12,"child");
    System.out.println(" child default constructor");
}
}

public class super_ {
    public static void main(String[] args) {
        parent p1=new parent();
        p1.show();


        child c=new child();
        c.show();

    }
}
