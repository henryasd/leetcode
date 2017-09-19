import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class CombinationSum_39 {
    public static void main(String[] args){
        int[] a = {2, 3, 6, 7};
        System.out.println(new CombinationSum_39().combinationSum(a, 7));
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList();
        if(candidates == null || candidates.length == 0) return list;
        Arrays.sort(candidates);
        backTrace(list,new LinkedList<Integer>(),candidates, target, 0);
        return list;
    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer> tmpList, int[] candidates, int target, int start) {
        if(target < 0)return;
        if(target == 0)list.add(new LinkedList<Integer>(tmpList));
        else {
            for(int i = start; i < candidates.length; i++){
                tmpList.add(candidates[i]);
                backTrace(list, tmpList, candidates, target - candidates[i], i);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
