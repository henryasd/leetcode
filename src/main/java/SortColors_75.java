import java.util.Arrays;

/**
 * Created by Henry on 2017/8/11.
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        if(nums == null)return;
        quickSort(nums, 0, nums.length - 1);
//        Arrays.sort(nums);
    }

    private void quickSort(int[] nums, int l, int r) {
        if(l < r){
            int i = adjustArray(nums, l, r);
            quickSort(nums, l, i - 1);
            quickSort(nums, i+1, r);
        }
    }

    private int adjustArray(int[] nums, int l, int r) {
        int i = l;
        int j = r;
        int x = nums[l];
        while (i < j){
            while (i < j && nums[j] >= x){
                j--;
            }
            if(i < j){
            nums[i] = nums[j];
            i++;
            }
            while (i < j && nums[i] < x){
                i++;
            }
            if(i < j){
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = x;
        return i;

    }
}
