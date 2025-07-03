package oops;

//A copy constructor is a constructor that creates a new object by copying the fields of an existing object.
//Java does not have a built-in copy constructor like C++, but the concept can still be implemented manually.
class example{
    int a;
    String name;
    example(int a,String name){
        this.a=a;
        this.name=name;
    }
    void  display(){
        System.out.println(a+" "+name);
    }
    example(example o)
    {
        a=o.a;
        name=o.name;

    }

}

public class copy_constructor {
    public static void main(String[] args) {

        example e=new example(25,"pooja");
        example e2=new example(e);

        e.display();
        e2.display();

    }
}
