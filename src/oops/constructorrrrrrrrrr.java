package oops;

class parent
{

    parent()
    {
        System.out.println("parent");
    }
    parent(String str)
    {
        System.out.println(str);
    }

}
class child extends parent
{
    child()
    {
        System.out.println("child");
    }
    child(String str)
    {
        super(str);
    }
}


public class constructorrrrrrrrrr {
    public static void main(String[] args) {
        child c=new child();
        child c2=new child("heloo this is me");
    }
}
