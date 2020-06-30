package com.zxx.five;

/**
 * 63.不同路径2
 * https://leetcode-cn.com/problems/unique-paths-ii/
 * @author Administrator
 * @date 2020/06/30
 */
public class UniquePaths2 {
    /**
     * 运行时间 0ms
     * @param obstacleGrid
     * @return
     */
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        obstacleGrid[0][0] = 1;
        for(int i = 1; i < row ; i++ ){
//            if(obstacleGrid[i][0] == 1){
//                obstacleGrid[i][0] = 0;
//            }else{
//                obstacleGrid[i][0] = obstacleGrid[i-1][0];
//            }
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1)?1:0;
        }
        for(int i = 1; i < column ; i++){
//            if(obstacleGrid[0][i] == 1){
//                obstacleGrid[0][i] = 0;
//            }else{
//                obstacleGrid[0][i] = obstacleGrid[0][i - 1];
//            }
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1)?1:0;
        }
        for(int i = 1;i < row; i++){
            for(int j = 1; j < column;j++){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }else{
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }
        return obstacleGrid[row - 1][column - 1];
    }
    /**
     * 方法二
     * 运行时间 1ms
     */
    public static int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1){
                    dp[j] = 0;
                } else if (j > 0){
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[width - 1];
    }
}
