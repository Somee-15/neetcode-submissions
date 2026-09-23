class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map =Map.of(
            ')','(',
            '}','{',
            ']','['
        );
        ArrayDeque stack = new ArrayDeque();

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop()!=map.get(ch)){
                    return false;
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
