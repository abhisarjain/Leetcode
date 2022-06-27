class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)
        {
            return nums[0]/k;
        }
        int i=0;
        int j=0;
        double sum =0;
        double x= Integer.MIN_VALUE;
        while(j<nums.length)
        {
            sum+=nums[j];
        
        if((j-i+1)<k)
        {
            // sum+=nums[j];    
            j++;
        }
        else if((j-i+1)==k)
        {
            x = Math.max(x,sum);
            sum-=nums[i];
            i++;
            j++;
           
            
             
          
            
        }
        }
        return x/k;
    }
}