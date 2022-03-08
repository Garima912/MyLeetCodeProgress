class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int minDist = Integer.MAX_VALUE;
        int w1 = -1;
        int w2 = -1;
        
        for(int i =0; i< wordsDict.length;i++){
            String word = wordsDict[i];
            if(word.equals(word1)){
                w1= i;
            }
            if(word.equals(word2)){
                w2= i;
            }
            if(w1 != -1 && w2 != -1)
                minDist = Math.min(minDist, Math.abs(w1-w2));
        }
        return minDist;
    }
}