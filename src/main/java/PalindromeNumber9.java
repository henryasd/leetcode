/**
 * Created by Henry on 2017/7/16.
 */
public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        boolean result = true;
        if(x < 0){
            result = false;
        }
        else if(x == 0){
            result = true;
        }
        else if(x > 0){
            int h = 1;
            int a = x;
            while ( a / h >= 10){
                h = h * 10;
            }
            while(a > 0){
                if(a/h != a % 10){
                    result = false;
                }
                a = a % h;
                a = a / 10;
                h = h / 100;

            }
        }

        return  result;

    }
}
