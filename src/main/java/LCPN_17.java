import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Henry on 2017/7/25.
 */
public class LCPN_17 {
    /**
     * 用队列存储字符串，每次先获取队列头的字符串，然后加上下一个字符串再放回队列
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        LinkedList<String> letterList = new LinkedList<String>();
        if(digits.length() > 0) {
            letterList.add("");
        }
        int length = digits.length();
        Map<Character,String> dict= new HashMap<Character,String>();
        dict.put('0',"1");
        dict.put('1',"1");
        dict.put('2',"abc");
        dict.put('3',"def");
        dict.put('4',"ghi");
        dict.put('5',"jkl");
        dict.put('6',"mno");
        dict.put('7',"pqrs");
        dict.put('8',"tuv");
        dict.put('9',"wxyz");
        for(int i = 0; i < length; i++){
            while (letterList.peek().length() == i){
                String s = letterList.remove();
                for(int j = 0; j < dict.get(digits.charAt(i)).length(); j ++){
                    letterList.add(s + dict.get(digits.charAt(i)).charAt(j));
                }
            }
        }
        return letterList;
    }
}
