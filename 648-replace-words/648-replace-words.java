class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        HashMap<String, Integer> rootMap = new HashMap <> ();
        
        for(String root: dictionary){
            rootMap.put(root, root.length());
        }
        
        List<String> sentenceList = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        
        for(int i =0; i< sentenceList.size();i++){
            for(int j =1; j <= sentenceList.get(i).length();j++){
                String prefix = sentenceList.get(i).substring(0,j);
                if(rootMap.containsKey(prefix)){
                    sentenceList.set(i,prefix);
                    break;
                }
            }
            
        }
        
        return String.join(" ", sentenceList);
        
    }
}