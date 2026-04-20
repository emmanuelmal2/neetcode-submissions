class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums == null || nums.length <= 0){
            return false;
        }

        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i], 0) + 1 );
            if(hashMap.get(nums[i])>1){
                return true;
            }
          
        }

        return false;
        
    }
}