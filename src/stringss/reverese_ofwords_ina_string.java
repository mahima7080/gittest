package stringss;

public class reverese_ofwords_ina_string {
    public static void main(String[] args) {
        String str="my name is mahima";
        String[] str_arr=str.split(" ");
        // Arrays.sort(str_arr);

        for(int i=0;i<str_arr.length;i++)
        {
            System.out.println(str_arr[i]);

        }

        String  str_index_1=str_arr[0];
        String  str_index_2=str_arr[1];
        String   str_index_3=str_arr[2];
        String   str_index_4=str_arr[3];

        //String s  = Arrays.toString(str_arr);
        // System.out.println(s);
        //  String ss=s.replace("[","").replace("]","").replace(",","");
        //    System.out.println(ss);

        System.out.println(str_index_1);
        String rev1="";
        int l=str_index_1.length();
        //System.out.println(l);
        for(int i=str_index_1.length();i>0;i--)
        {
            rev1=rev1+str_index_1.charAt(i-1);
        }
        System.out.println(rev1);

        String rev2="";
        // int l=str_index_1.length();
        //System.out.println(l);
        for(int i=str_index_2.length();i>0;i--)
        {
            rev2=rev2+str_index_2.charAt(i-1);
        }
        System.out.println(rev2);



        String rev3="";
        // int l=str_index_1.length();
        //System.out.println(l);
        for(int i=str_index_3.length();i>0;i--)
        {
            rev3=rev3+str_index_3.charAt(i-1);
        }
        System.out.println(rev3);



        String rev4="";
        // int l=str_index_1.length();
        //System.out.println(l);
        for(int i=str_index_4.length();i>0;i--)
        {
            rev4=rev4+str_index_4.charAt(i-1);
        }
        System.out.println(rev4);

        str_arr[0]=rev1;
        str_arr[1]=rev2;
        str_arr[2]=rev3;
        str_arr[3]=rev4;


        System.out.println();

        for(int i=0;i<str_arr.length;i++)
        {
            System.out.print(str_arr[i]+" ");

        }

    }
}
