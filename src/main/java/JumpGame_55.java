/**
 * Created by Henry on 2017/8/8.
 */
public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        boolean ans = false;
        if(nums == null || nums.length == 1)return true;
        int currBegin = 0;
        int currEnd = 0;
        int maxLength = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(currEnd > currBegin){
                return false;
            }
            maxLength = Math.max(maxLength, i + nums[i]);
            if(i == currEnd){
                currEnd = maxLength;
            }
        }
        return true;
    }
}
