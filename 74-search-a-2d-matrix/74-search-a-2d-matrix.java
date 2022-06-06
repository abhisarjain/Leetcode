class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int temp=0;
        for(int i =m-1 ;i>=0;i--)
        {
            if(matrix[i][0]==target)
            {
                return true;
            }
            if(target>matrix[i][0])
            {
                temp = i;
                break;
            }
        }
        
        for(int i = 0;i<n;i++)
        {
            if(matrix[temp][i] == target)
            {
                return true;
            }
            
        }
        
        return false;
    }
}