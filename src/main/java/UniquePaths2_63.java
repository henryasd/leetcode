/**
 * Created by Henry on 2017/8/9.
 * 动态规划，dp[i]记录每一行到达i列的路径数目，则状态转换公式：dp[i] = dp[i] + dp [i - 1];
 */
public class UniquePaths2_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row: obstacleGrid){
            for(int j  = 0; j < width; j++){
                if(row[j] == 1)
                    dp[j] = 0;
                else if(j > 0){
                    dp[j] = dp[j] + dp[j - 1];

                }
            }
        }
        return dp[width - 1];
    }


}
