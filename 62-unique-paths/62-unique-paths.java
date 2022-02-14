class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dict = new int[m][n];
        
        for(int i =0; i < m; i++){
            for(int j =0; j < n;j++){
                if(i == 0 || j == 0){
                    dict[i][j] = 1;
                }        
                else{
                    dict[i][j] = dict[i-1][j]+ dict[i][j-1];                }
            }
        }
        return dict[m-1][n-1];
    }
}