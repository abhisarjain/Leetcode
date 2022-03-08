class Solution {
    public List<List<Integer>> generate(int numRows) { 
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> temp = new LinkedList<Integer>();
        for(int i = 0;i<numRows;i++)
        {
            List<Integer> subresult = new LinkedList<Integer>();
            if(i==0)
            {
                subresult.add(1);
            }
            else
            {
                   for(int j = 0;j<=i;j++)
            {
                
                if(j==0 || j==i)
                {
                    subresult.add(1);
                }
                
                else{
                    temp = result.get(i-1);
                    subresult.add(temp.get(j-1)+temp.get(j));
                }
            }
            }
         
            result.add(subresult);
        }
        return result;
    }
}