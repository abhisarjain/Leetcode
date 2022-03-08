class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int result[][] = new int[r][c];
        int count=0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        for(int i =0;i<mat.length;i++)
        {
            for(int j =0;j<mat[i].length;j++)
        {
            temp.add(mat[i][j]);
                
        }
        }
        
        for(int i =0;i<r;i++)
        {
            for(int j =0;j<c;j++)
        {
            result[i][j] = temp.get(count);
                count++;
                
        }
        }
        return result;
    }
}