class Solution {
    public int characterReplacement(String s, int k) {
       int max =0;
       int longest=0;
       int left=0;
       int[] temp = new int[26];

       for(int right=0;right<s.length();right++){
        max = Math.max(max,++temp[s.charAt(right)-'A']);

        while((right-left+1)-max>k){
            temp[s.charAt(left)-'A']--;
            left++;
        }
        longest = Math.max(longest,(right-left+1));
       }

       return longest;
    }
}
