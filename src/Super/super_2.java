package Super;


class parent_2{
    int age=55;
    String name="madhu";

    void show()
    {
        System.out.println("parent");
    }
}

class child_2 extends parent_2{
    int age=25;
    @Override
    void show() {
        System.out.println(super.age);
        super.show();
        System.out.println("child");
        System.out.println(age);

    }
}
public class super_2 {

    public static void main(String[] args) {
        child_2 c=new child_2();
        c.show();
    }
}
