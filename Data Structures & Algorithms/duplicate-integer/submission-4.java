class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            counts.put(nums[i], counts.getOrDefault(nums[i],0)+1);
            if(counts.get(nums[i]) > 1){
                return true;
            }

        }
        return false;
        
    }
}