class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap();
        int[] result =new int[k];
       
       for(int i=0;i<nums.length;i++){
        int value = countMap.containsKey(nums[i])?countMap.get(Integer.valueOf(nums[i])):0;
        countMap.put(nums[i],++value);
        
       } 
       HashMap<Integer,Integer> countMapSorted= countMap.entrySet()
       .stream()
       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
       .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (oldvalue,newvalue)->oldvalue,
        LinkedHashMap::new
       ));

       int i=0;
       for(Map.Entry<Integer,Integer> entry:countMapSorted.entrySet()){
        if(i<k){
        result[i]=entry.getKey();
        i++;
        }
       }
       

       return result;
    }
}
