package Arrays;

public class HeasdmultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,3},{5,8},{10,11}};
        for (int[] a:arr)
        {
            for (int i:a)
            {
                System.out.println(i);
            }
        }
    }
}
