import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class Permutation2_47 {
    public static void main(String[] args){
        int[] a= {1,1,2};
        System.out.println(new Permutation2_47().permuteUnique(a));
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();
        backTrace(list, new LinkedList<Integer>(),nums, new boolean[nums.length]);
        return list;
    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer> tmpList, int[] nums, boolean[] sign) {
        if(tmpList.size() == nums.length)
            list.add(new LinkedList<>(tmpList));
        else {
            for (int i = 0; i < nums.length; i++){
                if(sign[i] || (i > 0 && nums[i] == nums[i-1] &&!sign[i-1]))continue;
//                if(tmpList.contains(nums[i]))continue;
                tmpList.add(nums[i]);
                sign[i] = true;
                backTrace(list, tmpList, nums,sign);
                sign[i] = false;
                tmpList.remove(tmpList.size() - 1);
            }

        }
    }
}
