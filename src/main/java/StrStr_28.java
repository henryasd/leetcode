/**
 * Created by Henry on 2017/7/30.
 */
public class StrStr_28 {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int left = 0;
        int right = nLen;
        if(hLen < nLen)return -1;
        boolean have = false;
        while (right <= hLen){
            if(haystack.substring(left, right).equals(needle)){
                have = true;
                break;
            }
            left++;
            right++;
        }
        if(have)
            return left;
        else
            return -1;
    }
}
