import java.util.*;

/**
 * Created by Henry on 2017/8/5.
 */
public class GroupAnagrams {
    public static void main(String[] args){
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(s));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new LinkedList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String charStr = new String(chars);
            if(map.containsKey(charStr)){
                map.get(charStr).add(s);
            }else{
                List<String> tmpList = new LinkedList<>();
                tmpList.add(s);
                map.put(charStr, tmpList);
            }

        }
        for(Map.Entry entry: map.entrySet()){
            lists.add((List<String>) entry.getValue());
        }
        return lists;
    }
}
