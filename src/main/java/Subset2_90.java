import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class Subset2_90 {
    public static void main(String[] args){
        int[] a= {1,2,2};
        System.out.println(new Subset2_90().subsetsWithDup(a));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(nums);
        backTrace(list, new LinkedList<Integer>(), nums, 0);
        return list;
    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer> tmpList, int[] nums, int start) {
        list.add(new LinkedList<>(tmpList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
                tmpList.add(nums[i]);
                backTrace(list, tmpList, nums, i + 1);
                tmpList.remove(tmpList.size() - 1);

        }
    }
}
