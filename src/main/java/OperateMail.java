import java.util.Scanner;

/**
 * Created by Henry on 2017/8/16.
 */
public class OperateMail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            String[] strs = str.split("@");
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < strs.length - 1; i++) {
                if (strs[i].length() + strs[i + 1].substring(0, strs[i + 1].indexOf('.') + 1).length() + 1 <= 124){
                    if (strs[i + 1].indexOf('.') <= 119 && strs[i].length() >= 3 && isValid(strs[i + 1])) {

                        sb.append(strs[i].substring(0, strs[i].length() - 3)).append("***");
                        sb.append("@");
                        sb.append(strs[i + 1].substring(0, strs[i + 1].indexOf('.') + 1));
                        strs[i + 1] = strs[i + 1].substring(strs[i + 1].indexOf('.') + 1);
                    } else if (strs[i].length() < 3 || !isValid(strs[i + 1])) {
                        sb.append(strs[i]);
                        sb.append("@");
                    }
                }
                else {
                    sb.append(strs[i]).append("@");
                }

            }
            sb.append(strs[strs.length - 1]);
            System.out.println(sb.toString());

        }
    }

    private static boolean isValid(String str) {
        int index = str.indexOf('.');
        if(index > 0){
            for(int i = 0; i < index; i++){
                if(!((str.charAt(i) >= '0'&& str.charAt(i) <='9') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                ||(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') || str.charAt(i) == '-')){
                    return false;
                }
            }
            return true;
        }
        else return false;
    }
}
