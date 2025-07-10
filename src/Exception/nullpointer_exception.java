package Exception;

public class nullpointer_exception {
    public static void main(String[] args) {
            try {
                String str=null;
                System.out.println(str.trim());
            }catch (NullPointerException e)
            {
                System.out.println("string is null");
            }

    }
}
