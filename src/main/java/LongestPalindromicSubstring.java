/**
 * Created by Henry on 2017/3/15.
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args){
        String s = "babad";
        String sub = new LongestPalindromicSubstring().longestPalindrome(s);
        System.out.print(sub);

    }
    public String longestPalindrome(String s){
        int start = 0, end = 0;
        int length = s.length();
        int maxLength = 0;
        for(int i = 0;i< length;i++){
            int j = i-1;
            int k = i+1;
            while(j >= 0 && k < length && s.charAt(j) == s.charAt(k)){
                if((k-j+1) > maxLength){
                    maxLength = k - j + 1;
                    start = j;
                    end = k;
                }
                j--;
                k++;
            }

        }
        for(int i = 0;i< length;i++){
            int j = i;
            int k = i + 1;
            while(j >= 0 && k < length && s.charAt(j) == s.charAt(k)){
                if((k-j+1) > maxLength){
                    maxLength = k - j + 1;
                    start = j;
                    end = k;
                }
                j--;
                k++;
            }

        }
        return s.substring(start, end+1);
    }
}
