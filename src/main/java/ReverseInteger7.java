/**
 * Created by Henry on 2017/7/16.
 */
public class ReverseInteger7 {
    public int reverse(int x) {
        int result = 0;
        long lx = (long) x;
        int maxValue = Integer.MAX_VALUE;
        boolean negFlag = false;
        if(lx < 0){
            lx = -lx;
            negFlag = true;
        }
        StringBuffer sb = new StringBuffer(lx+"");
        String s = sb.reverse().toString();
        if(Long.parseLong(s) > maxValue && negFlag == false){
            result = 0;
        }
        else if(Long.parseLong(s) > (long)maxValue + 1 && negFlag == true){
            result = 0;
        }
        else {
            result = Integer.parseInt(s);
            if(negFlag == true){
                result = - result;
            }
        }
        return  result;


    }
}
