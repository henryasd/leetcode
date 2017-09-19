/**
 * Created by Henry on 2017/1/16.
 */
public class TwoSum {
    public static void main(String[] ages){
        int[] nums = {1,3,5,9};
        int target = 8;
        int [] results = new int[2];
        results = twoSum(nums, target);
        System.out.println(results[0]);
        System.out.println(results[1]);

    }
    public static int[] twoSum(int[] nums, int target){
        int[] results = new int[2];
        int flag = 0;

        for(int i=0;i < nums.length; i++){
            if(flag != 0)
                break;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    results[0] = i;
                    results[1] = j;
                    flag = 1;
                    break;
                }

            }
        }
        return results;
    }
}
