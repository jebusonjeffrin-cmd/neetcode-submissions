class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R = matrix.length,C = matrix[0].length;
        int low = 0,high = R*C-1;
        while(low <= high){
            int mid = (low + high)/2;
            int row = mid/C,col = mid%C;
            if(matrix[row][col] == target)return true;
            
            else if(matrix[row][col] < target){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        return false;
        
    }
}
