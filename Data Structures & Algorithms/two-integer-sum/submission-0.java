class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            Integer returnedValue = seen.getOrDefault(target-nums[i], null);
            if(returnedValue == null){
                seen.put(nums[i], i );
            }else{
                return new int[]{seen.get(target-nums[i]), i};
            }

        }
        return null;
    }
}
