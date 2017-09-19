import java.util.HashMap;
import java.util.Map;

/**
 * Created by Henry on 2017/3/10.
 */
public class LongestSubstring {
    public static void main(String[] args){

    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max =0;
        if(s.length() == 0)
            return 0;
        for(int i=0, j=0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j +1);
        }

        return max;
    }
}

