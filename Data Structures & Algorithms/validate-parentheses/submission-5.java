class Solution {
    public boolean isValid(String s) {

        ArrayDeque<Character> stack = new ArrayDeque();

        int i=0;

        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
               
                Character top = stack.peek();
                
                if( null!=top && ((top=='[' && s.charAt(i)==']') || (top=='(' && s.charAt(i)==')')
                || (top=='{' && s.charAt(i)=='}'))){
                    stack.poll();
                }else{
                     stack.push(s.charAt(i));
                }
            }
            i++;
        }

        return stack.isEmpty()?true:false;
    }
}
