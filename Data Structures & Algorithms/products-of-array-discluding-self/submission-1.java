class Solution {
    public int[] productExceptSelf(int[] nums) {
       int size = nums.length;
       int[] suffix = new int[size]; 
       int[] prefix = new int[size];
       int[] result = new int[size];

       boolean flag = true;

       for(int i=0;i<size;i++){
        if(flag){
            prefix[i]=1;
            flag=false;
        }else{
            prefix[i]=nums[i-1]*prefix[i-1];
        }
       }

       flag=true;

       for(int i=size-1;i>=0;i--){
        if(flag){
            suffix[i]=1;
            flag=false;
        }else{
            suffix[i]=nums[i+1]*suffix[i+1];
        }
       }

       for(int i=0;i<size;i++){
        result[i]=prefix[i]*suffix[i];
       }


    return result;
    }
}  
