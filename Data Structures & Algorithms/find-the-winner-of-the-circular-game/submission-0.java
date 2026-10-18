class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int index =0;
        while(n>1){
            int indexToRemove = (index+k-1)%n;
            System.out.println(indexToRemove);
            list.remove(indexToRemove);
            n--;
            index = indexToRemove;
        }

        return list.get(0);
    }
}
