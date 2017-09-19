import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/3.
 */
public class Permutations_46 {
    public static void main(String[] args){
        int[] a= {1,2,3};
        System.out.println(new Permutations_46().permute(a));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        backTrace(list, new LinkedList<Integer>(), nums);
        return list;

    }

    private void backTrace(List<List<Integer>> list, LinkedList<Integer> tmpList, int[] nums) {
        if(tmpList.size() == nums.length){
            list.add(new LinkedList<>(tmpList));
//            return;
        }
        else {
            for(int i = 0; i < nums.length; i++){
                if(tmpList.contains(nums[i])) continue;
                tmpList.add(nums[i]);
                backTrace(list, tmpList, nums);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
