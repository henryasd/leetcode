/**
 * Created by Henry on 2017/8/11.
 */
public class Sqrt_69 {
    public static void main(String[] args){
        System.out.println(new Sqrt_69().mySqrt(2147395599));
    }
    public int mySqrt(int x) {
        long r = x;
        while ( r * r > x){
            r = (r + x/r)/2;
        }
        return (int)r;
//        if(x == 0 || x == 1)return x;
//        long ans = 2;
//        while (ans * ans < x){
//            ans = ans * ans;
//        }
//        for(long i = ans; i > 0; i--){
//            if(i * i <= x){
//                ans = i;
//                break;
//            }
//        }
//        return (int)ans;
    }
}
