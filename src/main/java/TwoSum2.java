import java.util.HashMap;
import java.util.Map;

/**
 * Created by Henry on 2017/2/18.
 */
public class TwoSum2 {
    public static void main(String[] args){
        int [] nums = {1, 3, 5, 9};
        int [] results = new int[2];
        int target = 8;
        TwoSum2 twosum2 = new TwoSum2();
        results = twosum2.twoSum(nums, target);
        System.out.println(results[0]+","+results[1]);
    }
    /**思路:1 遍历
     *
     *
     *
    */
    public int[] twoSum(int[] nums, int target){
        int[] results = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                results[1] = i;
                results[0] = map.get(target-nums[i]);
                return results;
            }
            map.put(nums[i], i);
        }
        return results;

    }
}
