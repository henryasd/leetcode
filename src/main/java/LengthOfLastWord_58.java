/**
 * Created by Henry on 2017/8/9.
 */
public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }
}
