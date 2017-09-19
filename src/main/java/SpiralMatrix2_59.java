/**
 * Created by Henry on 2017/8/9.
 */
public class SpiralMatrix2_59 {
    public static void main(String[] args){
        SpiralMatrix2_59 sm = new SpiralMatrix2_59();
        int n = 3;
        int[][]matrix = sm.generateMatrix(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n == 0)return matrix;
        int num = 1;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i++){
                matrix[rowBegin][i] = num;
                num++;
            }
            rowBegin ++;
            for(int j = rowBegin; j <= rowEnd; j++){
                matrix[j][colEnd] = num;
                num++;
            }
            colEnd--;
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    matrix[rowEnd][i] = num;
                    num++;
                }
            }
            rowEnd--;
            if(colBegin <= colEnd){
                for (int j = rowEnd; j >= rowBegin; j--){
                    matrix[j][colBegin] = num;
                    num++;
                }
            }
            colBegin ++;
        }
        return matrix;
    }
}
