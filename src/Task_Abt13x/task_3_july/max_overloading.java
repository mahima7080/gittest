package Task_Abt13x.task_3_july;

class max{
    int greatest(int a,int b,int c)
    {
        int max=a;
        if (b>max)
        {
            max=b;
        }
        if (c>max)
        {
            max=c;
        }
        return max;
    }
     float greatest(float a,float b,int c)
     {
         float max=a;
         if(b>max)
         {
             max=b;

         }
         if(c>max)
         {
             max=c;
         }
         return max;

     }
}
public class max_overloading {
    public static void main(String[] args) {
        max m=new  max();
        System.out.println(m.greatest(1,3,8));
        System.out.println(m.greatest(12.2F,12.4F,56));
    }
}
