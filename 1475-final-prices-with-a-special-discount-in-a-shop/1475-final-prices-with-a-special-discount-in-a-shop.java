class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<Integer>();
        // int result[] = new int
        for(int i=prices.length-1;i>=0;i--)
        {
            int temp = prices[i];
            if(s.isEmpty())
            {
                
                
                
                
            }
            
            else if(s.peek()>temp)
            {
                while(!s.isEmpty() && s.peek()>temp)
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    
                }
                else
                {
                    prices[i] = temp - s.peek();
                }
            }
            
             else if(s.peek()<=temp)
             {
                 prices[i] = temp - s.peek();
             }
            
            s.push(temp);
        }
        
        return prices;
    }
}