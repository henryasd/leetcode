import java.util.HashSet;
import java.util.Set;

/**
 * Created by Henry on 2017/8/2.
 */
public class ValidSudoku {
    public static void main(String[] args){
        ValidSudoku vs = new ValidSudoku();
        String[] strs = {"5.9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
        char[][] board = new char[9][9];
        for(int i = 0; i < strs.length; i ++){
            board[i] = strs[i].toCharArray();
        }
        System.out.println(vs.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        if(board == null || board.length != 9 || board[0].length != 9) return false;
        Set<Character>[][] palace = new HashSet[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                palace[i][j] = new HashSet<Character>();
        for(int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character>columnSet = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.') {
                    if (rowSet.contains(board[i][j]))
                        return false;
                    else
                        rowSet.add(board[i][j]);

                    if (palace[i/3][j/3].contains(board[i][j]))
                        return false;
                    else
                        palace[i/3][j/3].add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if (columnSet.contains(board[j][i]))
                        return false;
                    else
                        columnSet.add(board[j][i]);
                }


            }
        }
        return true;
//        for(int j = 0; j < board[0].length; j++){
//            Set<Character>columnSet = new HashSet<>();
//            for(int i = 0; i <board.length; i++){
//                if(board[i][j] != '.'){
//                    if(columnSet.contains(board[i][j]))
//                        return false;
//                    else
//                        columnSet.add(board[i][j]);
//                }
//            }
//        }
    }
}
