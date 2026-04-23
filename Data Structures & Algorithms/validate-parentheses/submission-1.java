class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();

        // save the corresponding ones
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(int i=0; i < s.length();i++){
            char currentCharacter = s.charAt(i);
            if(currentCharacter == '}' || currentCharacter == ']' || currentCharacter == ')' ){
                if(stack.isEmpty() || map.get(currentCharacter) != stack.peek()){
                    return false;
                }
                else{
                    stack.pop();
                }
                
            }else{
                stack.push(currentCharacter);
            }
        }

        return stack.isEmpty();

        
    }
}
