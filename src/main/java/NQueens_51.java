import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/6.
 * 利用回溯法
 * 首先用“.”初始化一个二维数组，然后对每一行进行回溯，在每一行对列进行遍历中选择“Q”的位置，如果放在该位置合适则回溯下一行，回溯结束后将该位置置为“.”。
 * 当回溯到最后一行后则将该组解放置在list中并返回。
 */
public class NQueens_51 {
    public static void main(String[] args){
        System.out.println(new NQueens_51().solveNQueens(4));
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>list = new LinkedList<>();
        String[][] strs= new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                strs[i][j] = ".";
            }
        }
        backTrace(list,strs,n,0);
        return list;
    }

    private void backTrace(List<List<String>> list, String[][] strs, int n, int row) {

        if(row == n){
            List<String> tmpList = new LinkedList<>();
            for(int i = 0; i < n; i++){
                StringBuffer sb = new StringBuffer();
                for(int j = 0; j < n; j++)
                    sb.append(strs[i][j]);
                tmpList.add(sb.toString());
            }
            list.add(tmpList);
            return;

        }
        for(int col = 0; col < n; col ++){
            if(isValid(strs, n, row, col)){
                strs[row][col] = "Q";
                backTrace(list, strs, n, row + 1);
                strs[row][col] = ".";
            }
        }
        return;
    }

    private boolean isValid(String[][] strs, int n, int row, int col) {
        for(int i = 0; i < n; i++){
            if(strs[i][col].equals("Q")) return false;
        }
        for (int i = row - 1, j = col -1; i >=0 && j >= 0; i--,j--){
            if(strs[i][j].equals("Q"))return false;
        }
        for(int i = row -1, j= col + 1; i >=0 && j < n; i--,j++){
            if(strs[i][j].equals("Q"))return false;
        }
        return true;
    }

}
