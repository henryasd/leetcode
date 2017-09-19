import java.util.Arrays;

/**
 * Created by Henry on 2017/7/25.
 */
public class ThreeSumCloset_16 {
    public int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE;
        int threeSum = 0;
        Arrays.sort(nums);
        outer:
        for(int i = 0; i < nums.length -2; i++){
            int sum = target - nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                if(nums[left] + nums[right] < sum){
                    int currentDiff = Math.abs(sum -nums[left] - nums[right]);
                    if(currentDiff < difference){
                        difference = currentDiff;
                        threeSum = nums[i] + nums[left] + nums[right];
                    }
                    left ++;
                }
                else if(nums[left] + nums[right] > sum){
                    int currentDiff = Math.abs(sum -nums[left] - nums[right]);
                    if(currentDiff < difference){
                        difference = currentDiff;
                        threeSum = nums[i] + nums[left] + nums[right];
                    }
                    right --;
                }
                else if(nums[left] + nums[right] == sum){
                    difference = 0;
                    threeSum = target;
                    break outer;
                }


            }

        }
        return threeSum;


    }
}
