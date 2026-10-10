class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int low = 0, high = cols*rows -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            int value = getValue(matrix, mid, cols);
            if (value == target) return true;
            if (value > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return false;        
    }

    int getValue(int[][] matrix, int pos, int cols) {
        int row = pos/cols;
        int col = pos%cols;
        return matrix[row][col];
    }
}

