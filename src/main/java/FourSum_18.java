import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/7/25.
 */
public class FourSum_18 {
    public static void main(String[] args){
        FourSum_18 fourSum = new FourSum_18();
        int[] a = {-3,-2,-1,0,0,1,2,3};
        int[] b = {0,0,0,0};
        int target = 0;
        System.out.println(fourSum.fourSum(a,0));
        System.out.println(fourSum.fourSum(b,0));
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> intList = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i == 0 || nums[i] != nums[i - 1] ){
                int sum3 = target - nums[i];

                for (int j = i + 1; j < nums.length - 2; j++) {
                    int sum2 = sum3 - nums[j];
                    int left = j + 1;
                    int right = nums.length - 1;
                    if(j == i+ 1 || nums[j] != nums[j - 1]) {
                        while (left < right) {
                            if (nums[left] + nums[right] == sum2) {
                                intList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                while (left < right && nums[left] == nums[left + 1])
                                {
                                    left++;
                                }
                                while (left < right && nums[right] == nums[right - 1])
                                {
                                    right--;
                                }
                                left++;
                                right--;
                            } else if (nums[left] + nums[right] < sum2) {
                                left++;
                            } else if (nums[left] + nums[right] > sum2) {
                                right--;
                            }
                        }
                    }

                }
            }
        }
        return intList;
    }
}
