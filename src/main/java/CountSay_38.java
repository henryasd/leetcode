/**
 * Created by Henry on 2017/8/3.
 */
public class CountSay_38 {

        public String countAndSay(int n) {
            String str = "1";
            if(n == 1) return str;
            for(int i = n;  i > 1; i-- ){
                str = countStr(str);
            }
            return str;
        }

    private String countStr(String str) {
        StringBuffer sb = new StringBuffer();
        int len= str.length();
        for(int i = 0; i < len;){
            int j = 0;
            for(j = i + 1; j < len; j++){
                if(str.charAt(i) != str.charAt(j)){
                    break;
                }
            }
            int iLen = j - i;
            sb = sb.append(iLen).append(str.charAt(i));
            i = j;
        }
        return sb.toString();
    }
}
