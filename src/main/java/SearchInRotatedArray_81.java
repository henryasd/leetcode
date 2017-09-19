/**
 * Created by Henry on 2017/8/13.
 */
public class SearchInRotatedArray_81 {
    public static void main(String[] args) {
        int[] a = {};
        System.out.println(new SearchInRotatedArray_81().search(a,4));
    }
    public boolean search(int[] nums, int target) {
        // Arrays.sort(nums);
        // if(Arrays.binarySearch(nums, target) > - 1){
        //     return true;
        // }
        // else
        //     return false;
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int m = (l + r)/2;
            if(nums[m] == target)return true;
            if(nums[m] < nums[r]){
                if(target > nums[m] && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }
            if(nums[m] > nums[r]){
                if(target >= nums[l] && target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
            else{
                r--;
            }

        }
        return false;

    }
}
