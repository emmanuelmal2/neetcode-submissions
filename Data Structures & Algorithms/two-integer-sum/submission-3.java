class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> aux = new HashMap<>();
   
 
        for(int i = 0; i< nums.length; i++){
            int result = target-nums[i];
            Integer found = aux.getOrDefault(result, null);
            if(found != null){
                return new int[]{found, i};
            }

            aux.put(nums[i], i);

                
        }
        return new int[]{};

    }
}
