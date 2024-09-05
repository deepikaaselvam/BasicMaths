package MyApproaches;
import java.util.Arrays;
public class SmallestNo2DArray {
    public static int smallestAndLarge(int[][]matrix)
    {
        int smallest[]=new int[matrix.length],Largest[]=new int[matrix.length];
        int smallestInRow=0,largestInCol=0;
        for (int i = 0; i < matrix.length; i++) {
            smallest[i] = matrix[i][0];

            for (int j = 0; j < matrix[i].length; j++) {
                Largest[j] = matrix[0][j];
                if (matrix[i][j] <= smallest[i]) {
                    smallestInRow = matrix[i][j];
                }
                if (matrix[j][i] >= Largest[i]) {
                    largestInCol= matrix[j][i];
                }
            }
            smallest[i]=smallestInRow;
            Largest[i]=largestInCol;
        }
        for(int i=0;i<smallest.length;i++)
        {
            for(int j=0;j<Largest.length;j++)
            {
                if(smallest[i]==Largest[j]) {
                    System.out.println(smallest[i]);
                    break;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4}, {9,3,8}, {15, 16, 17}};
        int ans= smallestAndLarge(matrix);
        System.out.println(ans);
    }
}


