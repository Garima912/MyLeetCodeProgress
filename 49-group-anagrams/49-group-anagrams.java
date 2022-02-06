class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> dict = new HashMap<>();
        
        for(String word: strs){
            char[] sortArr = word.toCharArray();
            Arrays.sort(sortArr);
            String sortedWord = new String(sortArr);
            
            if(!dict.containsKey(sortedWord)){
                ArrayList<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                dict.put(sortedWord, anagrams);
            }
            else{
                ArrayList<String> anagrams = dict.get(sortedWord);
                anagrams.add(word);
                dict.put(sortedWord,anagrams);
            }
        }
        
        return new ArrayList<>(dict.values());
        
    }
}