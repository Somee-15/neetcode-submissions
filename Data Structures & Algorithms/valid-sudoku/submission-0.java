class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row
        for (int i = 0; i < 9; i++) {
            HashSet set = new HashSet();

            for (int j = 0; j < 9; j++) {
                int val = board[i][j];
                if (set.contains(val)) {
                    return false;
                } else if (val != '.') {
                    set.add(val);
                }
            }
        }

        // column
        for (int i = 0; i < 9; i++) {
            HashSet set = new HashSet();

            for (int j = 0; j < 9; j++) {
                int val = board[j][i];
                if (set.contains(val)) {
                    return false;
                } else if (val != '.') {
                    set.add(val);
                }
            }
        }

        int[][] starts = {{0, 0}, {0, 3}, {0, 6}, {3, 0}, {3, 3}, {3, 6}, {6, 0}, {6, 3}, {6, 6}};

        for (int[] start : starts) {
            HashSet set = new HashSet();
            for (int row = start[0]; row < start[0] + 3; row++) {
                for (int col = start[1]; col < start[1] + 3; col++) {
                    int val = board[row][col];
                    if (set.contains(val)) {
                        return false;
                    } else if (val != '.') {
                        set.add(val);
                    }
                }
            }
        }

        return true;
    }
}
