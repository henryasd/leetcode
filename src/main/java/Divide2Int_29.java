/**
 * Created by Henry on 2017/7/30.
 */
public class Divide2Int_29 {
    public int divide(int dividend, int divisor){
        long result = divideLong(dividend, divisor);
        return (int)(result > Integer.MAX_VALUE? Integer.MAX_VALUE: result);
    }

    private long divideLong(long dividend, long divisor) {
        if(divisor == 0)return Integer.MAX_VALUE;
        long result = 1;
        boolean negFlag = false;
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            negFlag = false;
        }
        else negFlag = true;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        long sum = divisor;
        if(dividend < divisor) return 0;
        while ((sum+sum) <= dividend){
            sum += sum;
            result += result;
        }
        return negFlag ? -(result + divideLong(dividend - sum, divisor)) : (result + divideLong(dividend - sum, divisor));

    }
//    public int divide(int dividend, int divisor) {
//        if(divisor == 0)return Integer.MAX_VALUE;
//        long result = 0;
//
//        boolean negFlag = false;
//        long div = dividend;
//        long divs = divisor;
//        if((div >= 0 && divs > 0) || (div < 0 && divs < 0)){
//            negFlag = false;
//        }
//        else negFlag = true;
//        div = Math.abs(div);
//        divs = Math.abs(divs);
//        while ((div = div - divs) >= 0){
//            result++;
//
//        }
//        if(negFlag){
//            result = -result;
//        }
//        else{
//            if (result > Integer.MAX_VALUE) result = Integer.MAX_VALUE;
//        }
//        return (int)result;
//    }
}
