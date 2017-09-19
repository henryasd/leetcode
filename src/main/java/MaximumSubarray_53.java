import java.util.Arrays;

/**
 * Created by Henry on 2017/8/6.
 * 本题用动态规划方法，首先定义一个数组存储状态，状态数组中元素代表以nums[i]结尾的最大子数组的和
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
//        int ans = 0;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum[i - 1] >=0 ){
                sum[i] = sum[i - 1] + nums[i];
            }
            else if (sum[i - 1] <0){
                sum[i] = nums[i];

            }
//            else if(nums[i] < 0 && sum[i - 1] >= 0){
//                sum[i] = nums[i] + sum[i - 1];
//            }
//            else if(nums[i] < 0 && sum[i -1 ] < 0){
//                sum[i]= nums[i];
//            }
        }
        Arrays.sort(sum);
        return sum[sum.length - 1];
    }
}
