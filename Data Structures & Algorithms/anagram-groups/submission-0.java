class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            int[] aux = new int[26];

            for(char c: strs[i].toCharArray()){
                aux[c-'a']++;
            }

            String key = Arrays.toString(aux);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
        
    }
}
