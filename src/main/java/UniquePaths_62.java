/**
 * Created by Henry on 2017/8/9.
 */
public class UniquePaths_62 {
    public int uniquePaths(int m, int n) {
//        int[][] matrix = new int[m][n];
//        matrix[m - 1][n - 1] = 1;
//        for(int i = m - 1; i >= 0; i--){
//            for(int j = n - 1; j >= 0; j--){
//
//            }
//        }
//        return path(m, n, 0, 0);
        int [][] matrix = new int[m][n];
        for(int i = 0; i < n; i++)
            matrix[m - 1][i] = 1;
        for (int j = 0; j < m; j++)
            matrix[j][n - 1] = 1;
        for(int i = m -2; i >= 0; i --){
            for(int j = n -2; j >=0; j--){
                matrix[i][j] = matrix[i + 1][j] + matrix[i][j + 1];
            }
        }
        return matrix[0][0];
    }

//    private int path(int m, int n, int i, int j) {
//        if(i == m - 1 || j == n - 1)
//            return 1;
//        else {
//            return path(m, n, i +1, j) + path(m, n, i, j+1);
//        }
//    }
}
