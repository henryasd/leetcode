/**
 * Created by Henry on 2017/7/30.
 */
public class RDSA_26 {
    public static void main(String[] args){
        int[] a = {1,1,2};
        System.out.println(new RDSA_26().removeDuplicates(a));
    }

    /**
     * 双指针法，第一个指针指向不重复序列的最后一个，第二个指针指向未处理序列的第一个，如果第二个指针指向的数据与第一个指针指向的数据不相等，
     * 则将第二个指针指向的数据复制到第一个指针的后面，第一个指针向后移动，第二个指针依次遍历所有数据。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums){
        if(nums.length == 0) return nums.length;
        int p1 = 0;
        for(int p2 = 1; p2 < nums.length; p2 ++){
            if(nums[p1] != nums[p2]){
                p1 ++;
                nums[p1] = nums[p2];
            }
        }
        return p1 +1;

    }
//    public int removeDuplicates(int[] nums) {
//        int length = nums.length;
//        if(length == 1 || length == 0)
//            return length;
//        for(int i = 0; i < length - 1 ; i ++){
//            if(nums[i] == nums[i + 1]){
//                for(int j = i; j < length - 1;j++){
//                    nums[j ] = nums[j + 1];
//                }
//                length--;
//                i--;
//            }
//        }
//        return length ;
//    }
}
