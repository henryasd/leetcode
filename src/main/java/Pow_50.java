/**
 * Created by Henry on 2017/8/5.
 * 利用递归可以加快运算速度，
 */
public class Pow_50 {
    public static void main(String[] args){
        System.out.println(new Pow_50().myPow(-1, 2147483647));
    }
    public double myPow(double x, int n) {
        long ln = n;
        if(ln == 0) return 1;
        if(ln < 0){
            x = 1/x;
            ln = -ln;
        }
        return pow(x, ln);
    }
    public double pow(double x, long n){
        if(n == 0) return 1;
        return n%2 == 0? pow( x*x, n/2): x*pow(x*x, n/2);
    }
}
