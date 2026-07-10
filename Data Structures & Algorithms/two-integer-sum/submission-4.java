class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> aux = new HashMap<>();
   
 
        for(int i = 0; i< nums.length; i++){
            int result = target-nums[i];
            if (aux.containsKey(result)) {
                return new int[]{aux.get(result), i};
            }
            aux.put(nums[i], i);
            
        }
        return new int[]{};

    }
}
