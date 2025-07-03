package oops;


class studentsss{
    String name;
    int age;
    void show()
    {
        System.out.println(name+" "+age);
    }
    studentsss()
    {
        this("lavi",29);
    }
    studentsss(String name,int age)
    {

        this.name=name;
        this.age=age;

    }
}
public class this_method_insideconstructor {
    public static void main(String[] args) {
        studentsss s=new studentsss();
        s.show();
        studentsss stu1=new studentsss("mahima",27);
        stu1.show();

    }
}
