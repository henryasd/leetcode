import java.util.HashSet;
import java.util.Set;

/**
 * Created by Henry on 2017/8/2.
 */
public class SudokuSolver_37 {
    public static void main(String[] args){
        SudokuSolver_37 ss = new SudokuSolver_37();
        String[] strs = {"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
        //["519748632","783652419","426139875","357986241","264317598","198524367","975863124","832491756","641275983"]
        char[][] board = new char[9][9];
        for(int i = 0; i < strs.length; i ++){
            board[i] = strs[i].toCharArray();
        }
        ss.solveSudoku(board);
        for(int i = 0; i < 9; i++)
        System.out.println(board[i]);
    }
    public void solveSudoku(char[][] board) {
        backTrace(board);
    }

    private boolean backTrace(char[][] board) {
       for(int i = 0; i<9; i++){
           for(int j = 0; j<9;j++){
               if(board[i][j] == '.'){
                   for (char c = '1'; c <= '9'; c++){
                       if(isValid(board,c,i, j)){
                           board[i][j] = c;
                           if(backTrace(board))
                               return true;
                           else
                               board[i][j] = '.';
                       }
                   }
                   return false;
               }
           }
       }
       return true;
    }


    private boolean isValid(char[][] board, char c, int row, int col) {
        for(int i = 0; i < 9; i++){
            if(board[row][i] == c) return false;
            if(board[i][col] == c) return false;

        }
        int rowTmp = 3*(row/3);
        int colTmp = 3*(col/3);
        for(int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                if(board[rowTmp + i][colTmp + j] == c){
                    return false;
                }
            }
        }
        return true;
    }
}
