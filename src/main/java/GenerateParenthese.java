import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/7/28.
 */
public class GenerateParenthese {
    public static void main(String[] args){
        System.out.println(new GenerateParenthese().generateParenthesis(3));
    }
    /**
     * 用递归回溯法，注意递归结束条件: 左右括号剩余数量小于0，左括号剩余量多余右括号剩余量则说明这种情况不满足。
     *
     */
    public List<String> generateParenthesis(int n){
        List<String> list = new LinkedList<>();
        String str = "";
        int left = n;
        int right = n;
        traceBack(list,str,left,right);
        return list;
    }

    private void traceBack(List<String> list, String str, int left, int right) {
        if(left < 0 || right < 0 || left > right){
            return;
        }
        if(left == 0 && right == 0){
            list.add(str);
            return;
        }
        traceBack(list,str + "(", left-1,right);
        traceBack(list,str + ")",left, right-1);
    }

//    public List<String> generateParenthesis(int n) {
//        List<String> list = new LinkedList<>();
//        int open = 0;
//        int close = 0;
//        String str = new String();
//        traceBack(list, str, open, close, n);
//        return list;
//    }
//
//    private void traceBack(List<String> list, String str, int open, int close, int n) {
//        if(str.length() == (2 * n)){
//            list.add(str);
//            return;
//        }
//        if(open < n)
//            traceBack(list, str+"(",open + 1,close, n);
//        if(close < open)
//            traceBack(list, str + ")", open, close +1, n);
//    }

}
