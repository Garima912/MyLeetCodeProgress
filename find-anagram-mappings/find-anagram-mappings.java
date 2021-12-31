class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        
        for(int i = 0; i< nums2.length  ;  i++){
            dict.put(nums2[i], i);
        }
        int index =0;
        int[] mapping = new int[nums1.length];
        
        for(int n: nums1){
            mapping[index++] = dict.get(n);
        }
        return mapping;
    }
}