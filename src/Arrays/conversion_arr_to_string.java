package Arrays;

import java.util.Arrays;

public class conversion_arr_to_string {
    public static void main(String[] args) {
        int[] arr={1,5,3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i:arr){
        System.out.println(i);
        }

        int[] copy=Arrays.copyOf(arr,5);
        for (int i:copy){
            System.out.println(i);
        }

        int[] arrFill =new int[4];

        Arrays.fill(arrFill,7);

        for (int i:arrFill){
            System.out.println(i);
        }
    }
}
