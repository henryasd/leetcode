

/**
 * Created by Henry on 2017/8/1.
 */
public class SRSA_33 {
    public int search(int[] nums, int target) {
        int index = - 1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            if(nums[mid] <= nums[end]){
                if(target <= nums[end] && target > nums[mid]){
                    start = mid + 1;

                }
                else
                    end = mid -1;
            }
        }
        return -1;

    }

}
