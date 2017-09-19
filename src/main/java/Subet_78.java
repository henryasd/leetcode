import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class Subet_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        backTrace(list, new LinkedList<Integer>(), nums, 0);
        return list;
    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer> tmpList, int[] nums, int start) {
        list.add(new LinkedList<>(tmpList));
        for(int i = start; i < nums.length; i++){
            tmpList.add(nums[i]);
            backTrace(list, tmpList, nums, i + 1);
            tmpList.remove(tmpList.size()-1);
        }
    }
}
