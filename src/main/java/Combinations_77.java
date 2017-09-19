import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/11.
 */
public class Combinations_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new LinkedList<>();
        backTrace(list, new LinkedList<Integer>(), n, k, 1);
        return list;
    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer> integers, int n, int k, int begin) {
        if(k == 0){
            list.add(new LinkedList<>(integers));
            return;
        }
        for(int i = begin; i <= n; i++){
            if(!integers.contains(i)){
                integers.add(i);
                backTrace(list, integers, n, k - 1, i + 1);
                integers.remove(integers.size() - 1);
            }
        }
        
    }
}
