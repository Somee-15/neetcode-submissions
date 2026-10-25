class Solution {
    public void rotate(int[][] matrix) {
        transapose(matrix);
        rotateTemp(matrix);
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static void transapose(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        for (int i = 0; i <= row; i++) {
            for (int j = i + 1; j <= col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotateTemp(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        for(int i=0; i<=row; i++){
            int left =0,right=col;

            while(left<right){
                int temp =matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

        }
    
    }
}
