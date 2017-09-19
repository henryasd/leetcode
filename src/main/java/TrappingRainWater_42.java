import java.util.Stack;

/**
 * Created by Henry on 2017/8/4.
 */
public class TrappingRainWater_42 {
    public int trap(int[] height) {
        if(height == null || height.length < 3)return 0;
        int current = 0;
        int result = 0;
        Stack<Integer> st = new Stack<>();
        while (current < height.length){
            while (!st.isEmpty() && height[current] > height[st.peek()]){
                int bot = st.pop();
                if(st.isEmpty()) break;
                result = result + (Math.min(height[current], height[st.peek()]) - height[bot])* (current - st.peek() - 1);
            }

            st.push(current++);
        }
        return result;
    }
}
