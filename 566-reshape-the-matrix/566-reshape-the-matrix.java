class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
//         int result[][] = new int[r][c];
//         int count=0;
//         ArrayList<Integer> temp = new ArrayList<Integer>();
//         int m = mat.length, n = mat[0].length;
//         if (m * n != r * c) return mat;
//         for(int i =0;i<mat.length;i++)
//         {
//             for(int j =0;j<mat[i].length;j++)
//         {
//             temp.add(mat[i][j]);
                
//         }
//         }
        
//         for(int i =0;i<r;i++)
//         {
//             for(int j =0;j<c;j++)
//         {
//             result[i][j] = temp.get(count);
//                 count++;
                
//         }
//         }
//         return result;
        
        int m = mat.length;
        int n = mat[0].length;
        int result[][] = new int[r][c];
        int x=0,y=0;
        if (m * n != r * c) return mat;
        
        for(int i =0;i<m;i++)
         {
             for(int j =0;j<n;j++)
         {
            result[x][y] = mat[i][j];
                 y++;
                 if(y==c)
                 {
                     y=0;
                     x++;
                 }
                
         }
        }
        return result;
        
        
    }
}