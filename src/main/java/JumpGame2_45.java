/**
 * Created by Henry on 2017/8/4.
 */
public class JumpGame2_45 {
    public int jump(int[] nums) {
//        int i = 0;
        /**
         * 贪心算法，在[currBegin, currEnd]中计算该区域能跳转最远的距离，当遍历到currEnd点，令currEnd = 最远距离的点，step++,重复上述步骤
         */
        int step = 0;
        int currEnd = 0;
        int maxLength = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxLength = Math.max(maxLength, i + nums[i]);
            if(i == currEnd){
                currEnd = maxLength;
                step++;
            }
        }
        return step;

//        if(nums == null || nums.length == 0|| nums.length == 1) return 0;
////        int sum = 0;
//        int step = 1;
//        int i = 0;
//        if(i + nums[i] >= nums.length - 1) return 1;
//        while ( i + nums[i] < nums.length - 1){
//            int nextMax = -1;
//            int next = 0;
//            for (int j = 1; j <= nums[i]; j++){
//                if((j + nums[j]) >= nextMax){
//                    nextMax = j + nums[j];
//                    next = i + j;
//                }
//            }
//            i = next;
//            step++;
//
//        }
//        return step;

    }
}
