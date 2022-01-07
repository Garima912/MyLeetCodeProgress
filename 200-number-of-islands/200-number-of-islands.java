class Solution {
    public int numIslands(char[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;
        int islands = 0;
        
        if (grid == null){
            return 0;
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                
                if(grid[i][j] == '1'){
                    islands++;
                    grid[i][j] = '0';  // set value in grid as 0 , to mark as visited
                    Queue<Integer> adjacent = new LinkedList<Integer>();
                    int position = i*c + j ;
                    adjacent.add(position);
                    
                    while(!adjacent.isEmpty()){
                        
                        int front = adjacent.remove();
                        int frontRow= front / c;
                        int frontCol = front % c;
                        
                        if(frontRow >0 && grid[frontRow -1][frontCol] == '1'){  //up
                            int pos = (frontRow - 1) * c + frontCol;
                            adjacent.add(pos);
                            grid[frontRow -1] [frontCol] = '0';
                        }
                        if(frontRow < r-1 &&  grid[frontRow +1][frontCol] == '1' ){  // down
                           int pos = (frontRow + 1) * c + frontCol;
                            adjacent.add(pos);
                            grid[frontRow +1] [frontCol] = '0'; 
                        }
                        if(frontCol > 0 &&  grid[frontRow][frontCol-1] == '1'){   //left
                            int pos = frontRow * c + (frontCol -1);
                            adjacent.add(pos);
                            grid[frontRow] [frontCol -1] = '0'; 
                        }
                        if(frontCol < c -1 &&  grid[frontRow][frontCol + 1] == '1'){   //right
                            int pos = frontRow * c + (frontCol +1);
                            adjacent.add(pos);
                            grid[frontRow] [frontCol +1] = '0';  
                        }
                        
                        
                    }
                    
                }
                
                
            }
        }
        
        return islands;
        
        
        
        
    }
}