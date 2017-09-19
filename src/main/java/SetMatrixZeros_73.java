/**
 * Created by Henry on 2017/8/11.
 */
public class SetMatrixZeros_73 {
    public void setZeroes(int[][] matrix) {
        if(matrix == null)return;
        int[] rz = new int[matrix.length];
        int[] cz = new int[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                   rz[i] = 1;
                    cz[j] = 1;
                }
            }
        }
        for(int i = 0; i < rz.length; i++){
            if(rz[i] == 1){
                for(int k = 0; k < matrix[0].length; k++)
                    matrix[i][k] = 0;
            }
        }
        for(int i = 0; i < cz.length; i++){
            if(cz[i] == 1){
                for(int k = 0; k < matrix.length; k++)
                    matrix[k][i] = 0;
            }
        }
    }
}
