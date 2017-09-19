import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/7/25.
 */
public class Sum3_15 {
    /**
     * 15. 3Sum
     * 先对数组排序，然后利用两个指针从头尾像中间查找，找到对应的两个数
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i ++){
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0 - nums[i];
            if(i == 0 || nums[i] != nums[i - 1]) {
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1] ) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;

                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    } else if (nums[left] + nums[right] > sum) {
                        right--;
                    }
                }
            }

        }

        return list;


    }
}
