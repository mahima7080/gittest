package Exception;

public class try_catch_catch {
    public static void main(String[] args) {
        try {
            String str=null;
            str.length();

            str.charAt(0);
        }catch (NullPointerException | StringIndexOutOfBoundsException e)
        {
            System.out.println("exceptionnss");
        }
    }
}
