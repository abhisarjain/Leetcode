class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        
        HashSet<Integer> hs = new HashSet<>();
        int result =0;
        
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        
        
        for(int i = 0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]-1))
            {
                
            }
            
            else if(!hs.contains(nums[i]-1))
            {
                // int x =0;
                int j = 1;
                while(hs.contains(nums[i]+j))
                {
                    j++;
                    // if(hs.contains(nums[i]+j))
                    // {
                    //      x++;
                    //     j++;
                    // }
                    // else break;
                }
                result = Math.max(j,result);
            }
        }
        
        return result;
    }
}