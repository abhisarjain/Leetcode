class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums[0]<nums[nums.length-1])
        {
            return nums[0];
        }
        
        else
        {
            int i = 0;
            while(true)
            {
                if(nums[i]>nums[i+1])
                {
                    return nums[i+1];
                }
                i++;
            }
        }
        // return -1;
    }
}