package Arrays;

public class array_no_calculator {
    public static void main(String[] args) {
        int[] arr={10,29,69,22,82,84,96,96,1,12};
        int[] count=new int[10];
        for (int i=0;i<arr.length;i++)
        {
            ++count[arr[i]/10];
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(i+"  "+ count[i]);
        }
    }
}
