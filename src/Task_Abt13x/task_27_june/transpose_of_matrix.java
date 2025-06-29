package Task_Abt13x.task_27_june;

import java.util.Scanner;

public class transpose_of_matrix {
    public static void main(String[] args) {
     int[][] mat=new int[3][3];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                mat[i][j]=scanner.nextInt();
            }
        }
        System.out.println("original matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose of matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
