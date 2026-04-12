class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0; int t = 0; int r = matrix[0].length - 1; int b = matrix.length - 1;

        while (t <= b) {
            int m1 = t + ((b - t) / 2);
            if (target >= matrix[m1][l] && target <= matrix[m1][r]){
                while (l <= r) {
                    int m2 = l + (r-l) /2;

                    if (matrix[m1][m2] == target){
                        return true;
                    }
                    if (target < matrix[m1][m2])
                        r = m2 - 1;
                    else if (target > matrix[m1][m2]){
                        l = m2 + 1;
                    }        
                }
            }
            if (target < matrix[m1][l])
                b = m1 - 1;
            else if (target > matrix[m1][r]){
                t = m1 + 1;
            }
        }
        return false;
    }
}
