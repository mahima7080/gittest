package Exception;

public class exceptionnnn {
    public static void main(String[] args) {
        String str=args[0];
        System.out.println(str);
try {
    int num=Integer.parseInt(str);//       //it gives you java.lang.NumberFormatException

    System.out.println(num);
}catch (NumberFormatException e)
{
    throw new NumberFormatException("only integer");
}

    }
}
