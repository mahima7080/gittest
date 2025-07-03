package Task_Abt13x.task_3_july;
class print{
    int printdata(int a)
    {
        return a;
    }
    float printdata(float a,int b)
    {
        return a+b;
    }
    String printdata(String str)
    {
        return str;
    }
}
public class print_data_overloading {
    public static void main(String[] args) {
        print p=new print();
        System.out.println(p.printdata(1));
        System.out.println(p.printdata(12.1F,2));
        System.out.println("hi, this mahima ");
    }
}
