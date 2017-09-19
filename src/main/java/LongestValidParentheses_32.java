import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/1.
 */
public class LongestValidParentheses_32 {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0) return 0;
        int sLen = s.length();
        int maxLen = 0;
        int [] dp = new int[sLen];
        for(int i = 1;i < sLen;i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i - 1) == '('){
                    dp[i] = (i >= 2 ? dp[i-2] : 0) + 2;
                }else if(s.charAt(i - 1) == ')'){
                    if(i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] -1) == '('){
                        dp[i] = dp[i-1]+ 2+ (i - dp[i-1] > 2 ? dp[i - dp[i - 1] - 2]:0);
                    }
                }
                maxLen = Math.max(maxLen,dp[i]);
            }
        }
        return maxLen;

    }
}
