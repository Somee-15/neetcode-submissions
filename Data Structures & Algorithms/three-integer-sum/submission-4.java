class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>> ans = new HashSet<>();

       Arrays.sort(nums);
       int mid = nums.length/2;

       for(int i =0;i<=mid;i++){
        int left=i+1;
       int right = nums.length-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];

            if(sum>0){
                right--;

            }else if(sum<0){
                left++;

            }else{
                List<Integer> val = Arrays.asList(nums[i],nums[left],nums[right]);
                ans.add(val);
                left++;
                right--;
            }
        }
       }
       return new ArrayList<>(ans);
    }
}
