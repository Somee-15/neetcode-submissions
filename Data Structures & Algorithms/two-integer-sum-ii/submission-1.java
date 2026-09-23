class Solution {
    public int[] twoSum(int[] numbers, int k) {
        int left=0;
        int right=numbers.length-1;
        int[] ans = new int[2];

        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum>k){
                right--;
            }else if(sum<k){
                left++;

            }else{
                break;
            }
        }

        
        return new int[]{left+1,right+1};
    }
}
