package concepts;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] arr={2,7,10,11};
        arr[0]=1;

        String s="my name is mahima";

        String[] s1=s.split(" ");



        String[] strings_arr={"mahi","sanu","lavi"};
        for (int i:arr)
        {
            System.out.println(i);
        }


        for (String str:strings_arr)
        {
            System.out.println(str);
        }
    }
}
