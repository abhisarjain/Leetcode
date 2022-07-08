class Solution {
    public int[] asteroidCollision(int[] nums) {
        
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
           
            
            if(nums[i]>0)
            {
                s.push(nums[i]);
            }
            else
            {
                while(!s.isEmpty() && s.peek()>0 && s.peek() < -nums[i])
                {
                    s.pop();
                }
                
                if(!s.isEmpty() && s.peek() == -nums[i])
                {
                    s.pop();
                }
                
                else if(!s.isEmpty() && s.peek() > -nums[i]){}
                else
                {
                    s.push(nums[i]);
                }
                
            }
        }
        
        int r[] = new int[s.size()];
        for(int i=r.length-1;i>=0;i--){
            r[i] =  s.pop();
        }
        
        return r;
    }
}