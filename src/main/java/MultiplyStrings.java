/**
 * Created by Henry on 2017/8/4.
 */
public class MultiplyStrings {
    public static void main(String[] args){
        String s1 = "123";
        String s2 = "456";
        System.out.println(new MultiplyStrings().multiply(s1, s2));
    }


    public String multiply(String num1, String num2) {
        int num2Len = num2.length();
        String result = "";
        String[] mutipStr = new String[num2Len];
        for(int i = num2Len -1; i >= 0; i--){
            mutipStr[i] = mul(num1, num2.charAt(i)-'0', num2Len - 1 - i);
        }
        for(int i = 0; i <num2Len; i++){
            result = addStr(result, mutipStr[i]);
        }
        if(result.length() > 1){
            int index = 0;
            while (index < result.length()-1 && result.charAt(index) == '0') index ++;
            result = result.substring(index);
        }
        return result;
    }

    private String addStr(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int maxLen = Math.max(s1Len, s2Len);
        int minLen = Math.min(s1Len, s2Len);
        String maxStr = s1Len > s2Len? s1 : s2;
        String minStr = s1Len > s2Len? s2 : s1;
        for(int i = 0; i < maxLen-minLen; i++)
            minStr = 0 + minStr;
        String ans = "";
        int carry = 0;
        for(int i = maxLen - 1; i >=0; i--){
            int re = (minStr.charAt(i) -'0') + (maxStr.charAt(i) - '0') + carry;
            ans = re%10 + ans;
            carry = re/10;
        }

        if(carry !=0 )
            ans = carry + ans;
        return ans;

    }

    private String mul(String num1, int n, int m) {
        int num1Len = num1.length();
        int carry = 0;
        String result = "";
        if(n == 0) return "0";
        for(int i = num1Len - 1; i >= 0; i--){
            int ans = (num1.charAt(i) - '0') * n + carry;
            result =  ans%10 + result;
            carry = ans/10;
        }
        if(carry != 0)
            result = carry + result;
        for(int i = 0; i<m;i++)
            result = result + 0;
        return result;
    }

}
