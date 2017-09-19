import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class PP_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new LinkedList<>();
        backTrace(list,new LinkedList<String>(),s,0);
        return list;
    }

    private void backTrace(List<List<String>> list, LinkedList<String> tmpList, String s, int start) {
        if(start == s.length()){
            list.add(new LinkedList<>(tmpList));
        }
        else {
            for (int i = start; i < s.length(); i++){
                if(isPalindrome(s.substring(start,i + 1))){
                   tmpList.add(s.substring(start,i));
                    backTrace(list,tmpList,s,i+1);
                    tmpList.remove(tmpList.size()-1);
                }
            }

        }

    }

    private boolean isPalindrome(String substring) {
        if(substring.equals(new StringBuffer(substring).reverse().toString()))
            return true;
        else return false;
    }
}
