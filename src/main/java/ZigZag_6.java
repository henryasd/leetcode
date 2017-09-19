/**
 * Created by Henry on 2017/7/14.
 */
public class ZigZag_6 {
    public static void main(String[] args){
        String s1 = "a";
        String s2 = "abcdefghijklmn";
        String s3 = "ab";
        int num1 = 1;
        int num3 = 3;
        int num5 = 5;
        ZigZag_6 zz = new ZigZag_6();
        System.out.println(zz.convert(s1,num3));
        System.out.println(zz.convert(s2,num3));
        System.out.println(zz.convert(s2,num5));
        System.out.println(zz.convert(s3,num1));



    }
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int sLength = s.length();
        if(sLength <= numRows){
            sb.append(s);
        }

        else if(sLength > numRows){
            for(int i = 0; i < numRows; i++){
                int index1 = i;
                int index2 = i;
                int step1 = (numRows-1)*2 - i * 2;
                if(numRows == 1){
                    step1 = 1;
                }
                int step2 = i * 2;
                while (index1 < sLength || index2 < sLength){
                    if(index1 < sLength) {
                        sb.append(s.charAt(index1));
                    }
                    if(index2 < sLength && index2 > index1){
                        sb.append(s.charAt(index2));
                    }
                        if(step1 > 0) {
                            index1 = index2 + step1;
                            index2 = index1 + step2;
                        }
                        if(step1 == 0){
                            index2 = index1 + step2;
                            index1 = index2 + step1;
                        }

                }
            }
        }
        return  sb.toString();
    }
}
