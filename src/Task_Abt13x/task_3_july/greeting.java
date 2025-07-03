package Task_Abt13x.task_3_july;

class greet{

    void greet()
    {
        System.out.println("hello");

    }
    String greet(String s)
    {
        return s;
    }
}
public class greeting {
    public static void main(String[] args) {
        greet g=new greet();
        System.out.println();
        g.greet();
        System.out.println(g.greet("namaste"));

    }
}
