/**
 * Created by Henry on 2017/7/16.
 */
public class String2Int {
    public int myAtoi(String str) {
        long result = 0;
        str = str.trim();
        StringBuffer sb = new StringBuffer();
        int index = 0;
        boolean negFlag = false;
        if(str.length() > 0 && str.charAt(0) == '-'){
            negFlag = true;
            index ++;
        }
        if(str.length() > 0 && str.charAt(0) == '+'){
            index ++;
        }
        while(index < str.length()){
            if(str.charAt(index) >= '0' && str.charAt(index) <= '9'){
                sb.append(str.charAt(index));
                index ++;
            }
            else{
                break;
            }
        }
        if(sb.length() < 18) {
            try {
                result = Long.parseLong(sb.toString());
            } catch (NumberFormatException e) {
                result = 0;
            }
            if(negFlag){
                result = -result;
            }
            result = result > Integer.MAX_VALUE? Integer.MAX_VALUE: result;
            result = result < Integer.MIN_VALUE? Integer.MIN_VALUE: result;
        }
        else {
            if(!negFlag) {
                result = Integer.MAX_VALUE;
            }else if(negFlag){
                result = Integer.MIN_VALUE;
            }
        }

        return  (int)result;

    }
}
