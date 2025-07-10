package Exception;

public class array_index_out_of_bound_exception {
    public static void main(String[] args) {
        try {
            int[] arr={1,2,3,4};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index is out of range");
        }
        System.out.println("continues");
    }
}
