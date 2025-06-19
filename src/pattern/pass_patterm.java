package pattern;

public class pass_patterm {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            System.out.print("pass " + i + "-");
            for (j=1;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
