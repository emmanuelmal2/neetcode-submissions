class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int currentCount = hashmap.getOrDefault(nums[i],0) + 1;
            if(currentCount>1) return true;
            hashmap.put(nums[i], currentCount);

        }
        return false;
        
    }
}