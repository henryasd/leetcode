import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/6.
 */
public class SpiralMatrix_54 {
    public static void main(String[] args){
        int [][] m = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new SpiralMatrix_54().spiralOrder(m));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if(matrix == null || matrix.length == 0)return list;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd){
            if(rowBegin <= rowEnd) {
                for (int i = colBegin; i <= colEnd; i++) {
                    list.add(matrix[rowBegin][i]);
                }
            }
            rowBegin ++;
            if(colBegin <= colEnd){
                for (int i = rowBegin; i <= rowEnd; i++){
                    list.add(matrix[i][colEnd]);
                }
            }
            colEnd --;
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd --;
            if(colBegin <= colEnd){
                for (int i = rowEnd; i >= rowBegin; i--){
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin ++;

        }
        return list;
    }
}
