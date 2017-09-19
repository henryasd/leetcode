import java.util.Arrays;

/**
 * Created by Henry on 2017/7/24.
 */
public class CWMW11 {
    public int maxArea(int[] height) {
        /**
         * Time limit exceeded
         */
//        int maxArea = 0;
//        for(int i = 0; i < height.length; i++){
//            for(int j = i + 1; j < height.length; j ++){
//                int currentArea = Math.min(height[i], height[j]) * (j - i);
//                maxArea = maxArea > currentArea? maxArea: currentArea;
//            }
//        }
//
//        return  maxArea;
        /*
        method 2
         */

//        int maxArea = 0;
//        Arrays.sort(height);
//        for(int i = 0; i < height.length; i++){
//            int currentArea = height[i] * (height.length - 1 - i);
//            maxArea = maxArea > currentArea? maxArea: currentArea;
//        }
//        return  maxArea;
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]){
                left++;
            }
            else
                right--;
        }
        return maxArea;

    }

}
