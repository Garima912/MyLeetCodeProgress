class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> missing = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        
        for(int i=1; i<=nums.length;i++){
            if(!map.containsKey(i)){
                missing.add(i);
            }
        }
        return missing;
    }
}