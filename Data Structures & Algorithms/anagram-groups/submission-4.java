class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagramGroup = new HashMap();

        for(String s: strs){
            String key =Arrays.toString(generateKey(s.toLowerCase()));
            
            List<String> value = anagramGroup.containsKey(key)?
                            anagramGroup.get(key):new ArrayList();
            value.add(s);
            anagramGroup.put(key,value);
        }
        return new ArrayList(anagramGroup.values());

        
    }

    private int[] generateKey(String str){
        int[] sChar = new int[26];

        for(int i=0;i<str.length();i++){
            sChar[str.charAt(i)-'a']++;
        }
        return sChar;

    }

    
}
