import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class CombinationSum_40 {
    public static void main(String[] args){
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(new CombinationSum_40().combinationSum2(a, 8));
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(candidates);
        backTrace(list, new LinkedList<Integer>(), candidates, target,0);
        return list;
    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer>tmpList, int[]nums, int target, int start) {
        if(target == 0){
            list.add(new LinkedList<Integer>(tmpList));
        }
        else if(target < 0)
            return;
        else {
            for(int i = start; i <nums.length; i++ ){
                if(i > start && nums[i] == nums[i-1])continue;
                tmpList.add(nums[i]);
//                sign[i] = true;
                backTrace(list, tmpList, nums, target - nums[i], i + 1);
                tmpList.remove(tmpList.size() - 1);
//                sign[i]=false;
            }
        }
    }
}
