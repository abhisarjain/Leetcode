class Solution {
    public int maxArea(int[] height) {
//         Brute Force
         int res=0;
        // for(int i=0;i<height.length;i++)
        // {
        //     for(int j=i+1;j<height.length;j++)
        //     {
        //         res = Math.max(res,(j-i)*Math.min(height[i],height[j]));
        //     }
        // }
        // return res;
        
//         Optimal Solution
        int i = 0;
        int j = height.length-1;
        while(i<j)
        {
            res = Math.max(res,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return res;
      
        
        
        
    }
}