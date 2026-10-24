class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int buttom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= buttom && left <= right) {
            // go to right
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;
            // go buttom
            for (int row = top; row <= buttom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            if (top <= buttom) {
                // go to left
                for (int col = right; col >= left; col--) {
                    result.add(matrix[buttom][col]);
                }
                buttom--;
            }

            if(left<=right){
                 // go to up
                for (int row = buttom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        result.stream().forEach(System.out::println);
        return result;
    }
}
