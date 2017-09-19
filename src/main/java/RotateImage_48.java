/**
 * Created by Henry on 2017/8/5.
 * 图像顺时针旋转90度：首先，将矩阵转置，然后在水平方向做镜像操作，这样就无需利用额外空间。
 * 对于问题如果无法一步到位的话可以分开几步来做
 */
public class RotateImage_48 {
    public void rotate(int[][] matrix) {

        if(matrix == null) return;
        transpose(matrix);
        flip(matrix);

    }

    private void flip(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length/2; j++){
                swap(matrix, i, j, i, matrix[0].length - 1- j);
            }
    }

    private void transpose(int[][] matrix) {
     for (int i = 0; i < matrix.length; i++)
         for(int j = i; j < matrix[0].length; j++){
             swap(matrix, i, j, j, i);
         }
    }

    private void swap(int[][] matrix, int i, int j, int j1, int i1) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j1][i1];
        matrix[j1][i1] = tmp;
    }
}
