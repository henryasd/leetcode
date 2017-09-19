/**
 * Created by Henry on 2017/8/10.
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        int ap = a.length() - 1;
        int bp = b.length() - 1;
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        while (ap >=0 || bp >=0){
            int sum = carry;
            if(ap >= 0){
                sum += a.charAt(ap) - '0';
                ap --;
            }
            if(bp >= 0){
                sum += b.charAt(bp) - '0';
                bp --;
            }
            sb.append(sum%2);
            carry = sum/2;

        }
        if(carry > 0)
            sb.append(1);
        return sb.reverse().toString();
//        if(ap < 0){
//            while (bp >= 0){
//                int result = (b.charAt(bp) - '0') + carry;
//                ans = result%2 + ans;
//                carry = result/2;
//            }
//        }
    }
}
