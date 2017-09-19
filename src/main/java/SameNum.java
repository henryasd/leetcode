import java.util.Scanner;

/**
 * Created by Henry on 2017/8/16.
 */
public class SameNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            int max = 0;
            if(s1.length() != s2.length()){
                System.out.println(-1);
            }
            else {
                int len = s1.length();
                int tmpMax = 0;
                for(int i = 0; i < len; i++){
                    if(s1.charAt(i) > '9' || s1.charAt(i) < '0' || s2.charAt(i) > '9' || s2.charAt(i) < '0'){
                        System.out.println(-1);
                        break;
                    }
                    else {
                        if(s1.charAt(i) == s2.charAt(i)){
                            tmpMax ++;
                            max = Math.max(max, tmpMax);
                        }
                        else {
                            tmpMax = 0;
                        }
                    }
                }
                if(max == 1) max = 0;
                System.out.println(max);
            }
        }
    }
}
