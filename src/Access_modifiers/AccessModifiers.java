package Access_modifiers;



 class devices{
   private String model_name="base model";
   protected int model_no=10;
   String life_cycle="1year";
String getter()
{
    return model_name;
}
    void work()
    {
        System.out.println("work");
    }

}

class laptop extends devices{
    String laptop_name="Lenovo";
    int laptop_serial_no=111;
    String life_cycle="2year";
    void office_work()
    {    String got=getter();
        System.out.println(got);
        work();
        System.out.println(model_no);
        System.out.println(super.life_cycle);
        System.out.println(laptop_name);
        System.out.println();
    }

}
 public class AccessModifiers {
    public static void main(String[] args) {
        laptop l=new laptop();
       l.office_work();
   }
}
