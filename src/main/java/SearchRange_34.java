/**
 * Created by Henry on 2017/8/2.
 */
public class SearchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int [] result = new int[2];
        while (left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                int tmp = mid;
                while (tmp > 0 && nums[tmp - 1] == target){
                    tmp --;
                }
                result[0] = tmp;
                tmp = mid;
                while (tmp < nums.length-1 && nums[tmp + 1] == target){
                    tmp ++;
                }
                result[1] = tmp;
                return result;
            }
            else if(nums[mid] > target){
                right--;
            }
            else if(nums[mid] < target){
                left++;
            }

        }
        result[0] = -1;
        result[1] = -2;
        return result;
    }
}
