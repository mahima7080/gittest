package oops;
import oops.student;

class students{

   private String name;
    int age;

    void  display(String n)
    { int a=9;
        name=n;
        System.out.println(name);
        System.out.println(age);

    }
}

public class private_datamember {
int a=90;
    public static void main(String[] args) {
        students s=new students();
        s.age=8;
        s.display("mahima");
        private_datamember p=new private_datamember();
        System.out.println(p.a);
        student s_other=new student();
        System.out.println(s_other.a);


    }

}
