class Solution {
    public int firstMissingPositive(int[] a) {
        HashSet ans = new HashSet();
        for (int i = 0; i < a.length; i++) {
            ans.add(a[i]);
        }
         for (int i = 0; i < a.length; i++) {
            if(!ans.contains(i+1)){
                return i+1;
            }
        }
        return a.length+1;
    }
}