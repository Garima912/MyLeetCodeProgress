class Solution {
    public int slidingPuzzle(int[][] board) {
        int[][] directions = new int[][]{{1,0},{0,-1},{0,1},{-1,0}};
        int m = board.length;
        int n = board[0].length;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i < m;i++){
            for(int j = 0; j < n;j++){
                sb1.append(board[i][j]);
            }
        }
        for(int i = 1; i< m*n;i++){
            sb2.append(i);
        }
        sb2.append(0);
        String start = sb1.toString();
        String target = sb2.toString();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new ArrayDeque<>();
        q.offer(start);
        visited.add(start);
        int count  = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i< size;i++){
                String curBoard = q.poll();
                if(curBoard.equals(target)){
                    return count;
                }
                int indexZero = curBoard.indexOf('0');
                for(int[] dir: directions){
                    int x = indexZero/n+dir[0];
                    int y = indexZero%n+dir[1];
                    if(x>= 0 && x <m && y>= 0 && y <n){
                        int newZeroIndex = n*x+y;
                        StringBuilder nextBoard  = new StringBuilder(curBoard);
                        nextBoard.setCharAt(indexZero, curBoard.charAt(newZeroIndex));
                        nextBoard.setCharAt(newZeroIndex, curBoard.charAt(indexZero));
                        if(visited.add(nextBoard.toString())){
                            q.offer(nextBoard.toString());
                        }
                    }
                }
            }
            count++;
        }
        return -1;
        
    }
}