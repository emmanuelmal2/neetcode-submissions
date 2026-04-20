class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> frequencies = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            frequencies.put(s.charAt(i), frequencies.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i<t.length();i++){
            int returnedValue = frequencies.getOrDefault(t.charAt(i),0);
            if(returnedValue <= 0){
                return false;
            }else{
                frequencies.put(t.charAt(i), frequencies.get(t.charAt(i))-1);
            }
        }
        return true;

    }
}
