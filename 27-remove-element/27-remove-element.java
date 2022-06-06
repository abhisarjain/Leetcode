class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i] = -1;
                count++;
            }
        }
        
        int s = 0;
        int e = nums.length-1;
        while(s<e)
        {
            if(nums[e]==-1)
            {
                e--;
            }
            else if(nums[s]==-1)
            {
                if(e!=-1)
                {
                    nums[s] = nums[e];
                    s++;
                    e--;
                }
                
            }
            
            else if(nums[s]!=-1 && nums[e]!=-1)
            {
                s++;
            }
            
        }
        
        return nums.length-count;
    }
}