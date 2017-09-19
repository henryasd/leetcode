import java.util.Arrays;

public class SUCS581 {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 8, 10, 9, 15};
        int[] b = {1, 2, 3, 4};
        int[] c = {4, 3, 2, 1};
        int[] d = {1, 1, 2, 3, 2};
        SUCS581 sucs = new SUCS581();
        System.out.println(sucs.findUnsortedSubarray(a));
        System.out.println(sucs.findUnsortedSubarray(b));
        System.out.println(sucs.findUnsortedSubarray(c));
        System.out.println(sucs.findUnsortedSubarray(d));


    }

    public int findUnsortedSubarray(int[] nums) {
//        int begin = 0;
//        int end = nums.length-1;
//        int[] tmpNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(tmpNums);
//        for(int i = 0; i < nums.length; i++){
//            if(tmpNums[i] == nums[i]){
//                begin = i+1;
//            }
//            else{
//                break;
//            }
//        }
//        for(int j = nums.length-1; j >=0; j--){
//            if(tmpNums[j] == nums[j]){
//                end = j - 1;
//            }
//            else {
//                break;
//            }
//
//        }
//        if(end <= begin){
//            return 0;
//        }else {
//            return end - begin + 1;
//        }
        /*
        子数组结束的地方是比左边数组最大值小的最后一个地方，子数组开始的地方是比右边子数组最小值大的最后一个地方
         */
        int n = nums.length, beg = -1, end = -2, min = nums[n - 1], max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) end = i;
            if (nums[n - 1 - i] > min) beg = n - 1 - i;
        }
        return end - beg + 1;
    }
}
//        int begin = 0;
//        int end = nums.length - 1;
//        boolean hasBegin = false;
//        boolean hasEnd = false;
//        for(int i = 0; i< nums.length - 1; i++){
//            if(nums[i] >= nums[i+1] && !hasBegin){
//                hasBegin = true;
//                begin = i;
//            }
//            if(nums[nums.length - 1 - i -1] > nums[nums.length -1 -i] && !hasEnd){
//                hasEnd = true;
//                end = nums.length - 1 - i;
//            }
//
//
//        }
//        if(!hasBegin && !hasEnd){
//            return 0;
//        }
//        return end - begin +1;
//
//    }