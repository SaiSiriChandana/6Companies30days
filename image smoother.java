class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        int[][] result = new int[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                int cnt = 0, total = 0;
                
                // iterate over the cell and its neighbors
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        // to check if neighbor is within bounds
                        if (i >= 0 && i < row && j >= 0 && j < col) {
                            total += img[i][j];
                            cnt++;
                        }
                    }
                }
                
                //smoothed value
                result[r][c] = total / cnt;
            }
        }
        
        return result;
    }
}
