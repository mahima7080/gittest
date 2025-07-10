package inheritance;

/**
 * The super keyword refers to superclass (parent) objects.
 * It is used to call superclass methods, and to access the superclass constructor.
 * The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

 */
class base
{
    int a=10;
  void show()
    {
        System.out.println("base");
    }
}
class derive extends base
{
    int a=110;
    int x=super.a;
    void show(){
        System.out.println("derive");
        super.show();
        }
    void hi()
    {
        System.out.println(x);
        show();
       a=11;
       super.show();
        System.out.println(a+"  "+super.a);
    }

}
public class driver_class {
    public static void main(String[] args) {
        derive d=new derive();
d.x=19999;
        System.out.println(d.x);
        d.show();

        d.hi();
    }
}
