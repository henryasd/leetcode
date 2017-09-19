/**
 * Created by Henry on 2017/8/2.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                index = mid;
                return index;

            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return right + 1;



    }
}
