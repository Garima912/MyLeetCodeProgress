public class Solution {
   
    public int minPathSum(int[][] grid) {
     
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int minSum = 0;
        
        dp[m-1][n-1] = grid[m-1][n-1];
        
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(i == m-1 && j != n-1){
                    minSum = grid[i][j] + dp[i][j+1];
                    dp[i][j]= minSum;
                }
                if(j == n-1 && i != m-1){
                    minSum = grid[i][j] + dp[i+1][j];
                    dp[i][j]= minSum;
                }
                if(i != m-1 && j != n-1){
                    minSum = grid[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
                    dp[i][j] = minSum;
                }
            }
        }
        return dp[0][0];
        
    }
}