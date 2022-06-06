class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        for(int i =0;i<9;i++)
        {
            HashSet<Character> r1 = new HashSet<>();
            HashSet<Character> r2 = new HashSet<>();
             for(int j =0;j<9;j++)
            {
                
                if(r1.contains(board[j][i]))
                {
                    return false;
                    
                }
                 
                else if(board[j][i]!='.')
                {
                    r1.add(board[j][i]);
                }
                 
                
                 
                 
                 if(r2.contains(board[i][j]))
                {
                    return false;
                    
                }
                 
                else if(board[i][j]!='.')
                {
                    r2.add(board[i][j]);
                }
                 
                 
                 
                 if((i+3)%3==0 && (j+3)%3==0)
                 {
                    HashSet<Character> r3 = new HashSet<>();   
                     for(int a = i;a<i+3;a++)
                     {
                         for(int b = j;b<j+3;b++)
                        {
                             
                             
                            if(r3.contains(board[a][b]))
                            {
                                return false;
                    
                            }
                 
                            else if(board[a][b]!='.')
                            {
                                r3.add(board[a][b]);
                            }
                             
                             
                             
                             
                        }
                     }
                 }
                
            
            }
           
            
        }
        
        return true;
    }
}