package oops;

class student{
    String name;
    int Age;
    int a=5555;

    void dispaly()
    {
        System.out.println(name);
        System.out.println(Age);
    }
    void  d(student stu)
    {
        System.out.println(stu.name + stu.Age);
    }
    static void hi()
    {
        int a=7;
        System.out.println("hi");
    }
}

public class oopsss {
   static int a;
    public static void main(String[] args) {
        student s=new student();
        s.name="sanu";
        s.Age=6;
        s.dispaly();
        student s2=new student();
        s2.name="lavi";
        s2.Age=7;
        s2.dispaly();
        student s3=s2;
        s3.d(s2);;
h.mahi();
        student.hi();
       // System.out.println(a);

        test t=new test();
        System.out.println(t.test);

    }

}

