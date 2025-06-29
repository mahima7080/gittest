package Task_Abt13x.task_27_june;

public class sum_of_diogonal {
    public static void main(String[] args) {
        int sum=0;
        int[][] matrix ={
                {1,2,3,},
                {4,5,6},
                {7,8,9}};

        for(int i=0 ;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("sum of a diadonal");
        for(int i=0 ;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {if(i==j)
                sum=sum+matrix[i][j];
            }


        }
        System.out.println(sum);



    }
}
