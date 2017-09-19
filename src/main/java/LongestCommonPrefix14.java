/**
 * Created by Henry on 2017/7/24.
 */
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        String lcp = new String();
        if(strs.length > 0) {
            lcp = strs[0];
        }
        for(int i = 1; i < strs.length; i++){
            int end = 0;
            int length = Math.min(lcp.length(), strs[i].length());
            while (end < length){
                if(lcp.charAt(end) == strs[i].charAt(end)){
                    end ++;
                }
                else
                    break;
            }
            lcp =  lcp.substring(0, end);

        }
        return lcp;
    }

//    private String getCommonStr(String lcp, String str) {
//        int end = 0;
//        int length = Math.min(lcp.length(), str.length());
//        while (end < length){
//            if(lcp.charAt(end) == str.charAt(end)){
//                end ++;
//            }
//            else
//                break;
//        }
//        return lcp.substring(0, end);
//
//    }
}
