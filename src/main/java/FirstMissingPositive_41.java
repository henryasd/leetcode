/**
 * Created by Henry on 2017/8/4.
 */
public class FirstMissingPositive_41 {
    public int firstMissingPositive(int[] nums) {
        /**
         * 每个数字放在该数字所对应索引-1的位置上
         */
        int index = 0;
        int result = 0;
        while (index < nums.length){
            if(nums[index] == index + 1 || nums[index] <= 0 || nums[index] > nums.length) index++;
            else if(nums[index] != nums[nums[index] - 1]) swap(nums, index, nums[index] - 1);
            else index++;
        }
        index = 0;
        while (index < nums.length&& nums[index] == index + 1)index++;
        return index + 1;
    }

    private void swap(int[] nums, int index, int i) {
        int tmp = nums[index];
        nums[index] = nums[i];
        nums[i] = tmp;
    }
}
