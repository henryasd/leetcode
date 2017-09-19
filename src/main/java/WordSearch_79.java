/**
 * Created by Henry on 2017/8/11.
 */
public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null || word.length() == 0)return false;
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
               if(match(board, i, j, word, 0)){
                    return true;
               }

            }
        }
        return false;
    }

    private boolean match(char[][] board, int i, int j, String word, int index) {
        int row = board.length;
        int col = board[0].length;
        if(index == word.length())return true;
        if(i < 0 || j < 0 || i == row || j == col)return false;
        if(board[i][j] != word.charAt(index))return false;
        char tmp = board[i][j];
        board[i][j] = '$';
        boolean exists = match(board, i-1, j, word, index + 1) ||
                match(board, i + 1, j, word, index + 1) ||
                match(board, i, j - 1, word, index + 1) ||
                match(board, i, j + 1, word, index + 1);
        board[i][j] = tmp;
        return exists;
    }
}
