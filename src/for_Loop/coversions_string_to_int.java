package for_Loop;

public class coversions_string_to_int {
    public static void main(String[] args) {
        int num=67;
        String string="67";
        //###########################################string to int #################################################
       /* if (num==Integer.parseInt(string))
        {
            System.out.println("equal"+ num + string);
        }
        else
        {
            System.out.println("not equal"+ num + string);
        }*/


       // ################################### int to String ######################################
        if (String.valueOf(num).equals(string))
        {
            System.out.println("equal"+ num + string);
        }
        else
        {
            System.out.println("not equal"+ num + string);
        }


    }
}
