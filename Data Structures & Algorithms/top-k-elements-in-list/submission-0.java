class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num: nums){
            counts.put(num, counts.getOrDefault(num, 0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        
        for(Integer count: counts.keySet()){
            int freq = counts.get(count);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(count);

        }

        int[] output = new int[k];
        int index = 0;

        for(int freq = buckets.length-1; freq>= 0 && index<k ; freq--){
            if(buckets[freq] != null){
                for(int num: buckets[freq]){
                    output[index++] = num;
                    if(index == k){
                        break;
                    }
                }
            }
        }

        return output;


     
    }
}
