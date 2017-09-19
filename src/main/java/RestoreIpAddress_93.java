import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/15.
 */
public class RestoreIpAddress_93 {
    public static void main(String[] args) {
        System.out.println(new RestoreIpAddress_93().restoreIpAddresses("0000"));
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new LinkedList<String>();
        if(s == null || s.length() < 4) return list;
        int n = s.length();

        backTrace(list, s, new LinkedList<Integer>(), 1);
        return list;
    }
    public void backTrace(List<String>list, String s, List<Integer> indexs, int start){
        if(indexs.size() == 3){
            int x = Integer.parseInt(s.substring(indexs.get(indexs.size() - 1)));
            if(x >= 0 && x <= 255){
                StringBuffer sb = new StringBuffer();
                sb.append(s.substring(0, indexs.get(0))).append(".");
                sb.append(s.substring(indexs.get(0), indexs.get(1))).append(".");
                sb.append(s.substring(indexs.get(1), indexs.get(2))).append(".");
                sb.append(s.substring(indexs.get(2)));
                list.add(sb.toString());
            }
            return;

        }
        for(int i = start; i < s.length() && i < start + 3; i++){
            int last = indexs.isEmpty()? 0 : indexs.get(indexs.size() - 1);
            int x = Integer.parseInt(s.substring(last, i));
            if(x >=0 && x <=255){
                indexs.add(i);
                backTrace(list, s, indexs, i + 1);
                indexs.remove(indexs.size() - 1);
            }

        }

    }
}
