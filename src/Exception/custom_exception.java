package Exception;


class  AgeToSmall extends Exception{
    String str;
    AgeToSmall(String str)
    {
        this.str=str;
    }

}
public class custom_exception{

    public static void main(String[] args) {
        int age =15;
        try {
            if(age<18)
            {
                throw new AgeToSmall("age too small");
            }
        }catch (AgeToSmall e)
        {
            System.out.println(e.str);
        }

    }
}
