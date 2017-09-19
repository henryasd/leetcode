/**
 * Created by Henry on 2017/7/30.
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return nums.length;
        int len = nums.length;
        int p1 = 0;
        boolean have = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                for(int j = 0; j < nums.length - i; j ++){
                    nums[j] = nums[j + i];
                }
                len = len - i;
                have = true;
                break;
            }
        }
        if(!have) return 0;
        for(int p2 = 1; p2 < len; p2 ++){
            if(nums[p2] != val){
                p1 ++;
                nums[p1] = nums[p2];
            }
        }
        return p1 + 1;
    }
}
