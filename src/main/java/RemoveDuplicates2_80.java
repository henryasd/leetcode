import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/11.
 */
public class RemoveDuplicates2_80 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1 || nums.length == 2) return nums.length;
        int len = nums.length;
        List<Integer>list = new LinkedList<>();
        int count = 0;
        list.add(nums[0]);
        list.add(nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(nums[i] == nums[i - 1] && nums[i] == nums[i - 2]){
//                count++;
            }
            else {
                list.add(nums[i]);
//                len = len - count;
//                count = 0;
            }
        }
//        if(count > 1)
//            len = len - count + 1;
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();

    }
}
