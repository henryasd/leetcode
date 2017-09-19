import java.util.HashMap;
import java.util.Map;

/**
 * Created by Henry on 2017/7/24.
 */
public class RomanToInteger12 {
    public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int currentValue = 0;
        int nextValue = 0;
        for(int i = 0; i < length; i++){
            int num = romanMap.get(s.charAt(i));
            if(i + 1 < length){
                int nextNum = romanMap.get(s.charAt(i + 1));
                if(nextNum > num)
                {
                    num = -num;
                }
            }
            sum = sum + num;


        }


        return sum;
    }
}
