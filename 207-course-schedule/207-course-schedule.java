class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> courseMap = new HashMap<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] checked = new boolean[numCourses];
        
        //create graph for courses
        for(int[] pair: prerequisites){
            
            if(courseMap.containsKey(pair[1])){
                ArrayList<Integer> nextCourses = courseMap.get(pair[1]);
                nextCourses.add(pair[0]);
                courseMap.put(pair[1], nextCourses );
            }
            else{
                ArrayList<Integer> nextCourses = new ArrayList<>();
                nextCourses.add(pair[0]);
                courseMap.put(pair[1], nextCourses );
            }
        }
        
        
        for(int curr =0; curr < numCourses; curr++){
            if(hasCycle(curr, courseMap,visited, checked)){
                return false;
            } 
        }
        return true;
    }
    
    public boolean hasCycle(int curr, HashMap <Integer, ArrayList<Integer>> courseMap, boolean[] visited, boolean[] checked ){
        
        if(visited[curr]){  //cycle exists if visiting a node again
            return true;
        }
        if(checked[curr]){
            return false;
        }
        if( ! courseMap.containsKey(curr)){
            return false;
        }
        
        visited[curr] = true;  // mark the current node as visited
        
        ArrayList<Integer> nextCourses = courseMap.get(curr);
        
         boolean result = false;
        for(Integer course: nextCourses){
            result =  hasCycle(course, courseMap, visited, checked);
            if(result) break;
        }
        
        visited[curr] = false; 
        
        checked[curr] = true;
        return result;
        
    }
}