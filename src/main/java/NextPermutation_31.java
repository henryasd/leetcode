import java.util.Arrays;

/**
 * Created by Henry on 2017/7/31.
 */
public class NextPermutation_31 {
    public void nextPermutation(int[] nums) {
        boolean find = false;
        for(int i = nums.length - 2; i >=0; i--){
            if(nums[i] < nums[i+1]){
                for(int j = nums.length - 1; j > i; j--){
                    if(nums[j] > nums[i]){
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        int left = i+1;
                        int right = nums.length - 1;

                        while (left < right){
                            int  abc = nums[left];
                            nums[left] = nums[right];
                            nums[right] = abc;
                            left ++;
                            right --;
                        }
                        break;
                    }
                }
                find = true;
                break;
            }
        }
        if(!find)
            Arrays.sort(nums);
    }
}
