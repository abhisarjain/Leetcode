class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean bool = false;
        for(int i = 0;i<m;i++)
        {
            HashSet<Integer> hs = new HashSet<Integer>();

            for(int j=0;j<n;j++)
            {
                hs.add(matrix[i][j]);
            }
            if(hs.contains(target)){
                bool = true;
                break;
            }
        }
        return bool;
    }
}