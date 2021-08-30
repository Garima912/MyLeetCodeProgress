class Solution {
    
    
    private void DFS(int c, int r, char[][] grid){
        int totalRows = grid.length;
        int totalCol = grid[0].length;
        if(c <0 || r <0 || c >= totalCol || r >= totalRows|| grid[r][c] == '0'){
            return;
        }
        if(grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        
        DFS(c, r+1, grid); //right
        DFS(c, r-1,grid);  //left
        DFS(c+1, r, grid);  // down
        DFS(c-1, r,grid);    //up
    }
    public int numIslands(char[][] grid) {
        int islands = 0;
        if(grid.length==0 || grid == null){
            return 0;
        }
        
        for(int r  =0; r< grid.length;r++){
            for (int c = 0; c <grid[0].length;c++){
                if(grid[r][c] == '1'){
                    islands++;
                    DFS(c,r,grid);
                }
            }
        }
        return islands;
        
    }
}