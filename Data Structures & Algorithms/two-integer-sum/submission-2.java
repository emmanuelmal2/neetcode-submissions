class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> aux = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            Integer value = aux.getOrDefault(target-nums[i], null);
            if(value == null){
                aux.put(nums[i], i);
            }else{
                return new int[]{value, i};
            }
        }

        return new int[]{};

    }
}
