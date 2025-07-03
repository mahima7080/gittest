package Task_Abt13x.task_3_july;


class addition{
    int addition(int a,int b)
    {
       return a+b ;
    }
    double addtion(double a, double b,double c)
    {
        return a+b+c;
    }

}
public class function_overloading_adddtion {
    public static void main(String[] args) {
        addition a=new addition();
        System.out.println(a.addition(2,9));
        System.out.println(a.addtion(12.1,22.1,78.1));
    }
}
