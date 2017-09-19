/**
 * Created by Henry on 2017/8/10.
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >=0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNum = new int[digits.length + 1];
        newNum[0] = 1;
        return newNum;
    }
}
