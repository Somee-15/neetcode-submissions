class Solution {
    public int maxArea(int[] a) {
        int i=0,j=a.length-1;
        int maxArea=Integer.MIN_VALUE;

        while(i<j){
            int breath = j-i;
            int heigth = Math.min(a[i],a[j]);
            maxArea = Math.max(maxArea,breath*heigth);

            if(a[i]<=a[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxArea;
    }
}
