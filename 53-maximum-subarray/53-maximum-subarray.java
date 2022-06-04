class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int cur = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                count++;
            }
            cur += nums[i];
            if(cur > max)
            {
                max = cur;
            }
            if(cur < 0)
            {
                cur = 0;
            }
        }
        if(nums.length==1)
        {
            max = nums[0];
        }
        if(count == nums.length)
        {
            int maximum = nums[0];
            for(int i =0;i<nums.length;i++)
            {
                if(nums[i]>maximum)
                {
                    maximum = nums[i];
                }
                
            }
            
            max = maximum;
            // Arrays.sort(nums);
            // max = nums[nums.length-1];
        }
        return max;
    }
}