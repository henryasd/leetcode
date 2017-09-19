/**
 * Created by Henry on 2017/8/6.
 */
public class NQueens_52 {
    public static void main(String[] args){
        System.out.println(new NQueens_52().totalNQueens(4));
    }
    public int totalNQueens(int n) {
        char[][] chars = new char[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                chars[i][j] = '.';
            }
        }
        int[] ans = {0};
        backTrace(chars, ans, 0);
        return ans[0];
    }

    private  void backTrace(char[][] chars, int[] ans, int row) {
        if(row == chars.length){
//            for(int i = 0; i < chars.length; i++)
//            System.out.println(chars[i]);
            ans[0]++;
            return;
        }
        for (int col = 0; col < chars.length; col++){
            if(isValid(chars, row, col)){
                chars[row][col] = 'Q';
                backTrace(chars, ans, row + 1);
                chars[row][col] = '.';
            }
        }

    }

    private boolean isValid(char[][] chars, int row, int col) {
        for(int i = 0; i < chars.length; i++)
            if(chars[i][col] == 'Q')return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--,j--)
            if(chars[i][j] == 'Q')return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < chars.length; i--, j++)
            if(chars[i][j] == 'Q')return false;
        return true;
    }
}
