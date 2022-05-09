class Solution {
    public void rotate(int[] nums, int k) {
        // int s = 0;
        // int e = nums.length - 1;
        // for(int i=0;i<k;i++)
        // {
        //     while(s!=e)
        // {
        //     int temp = nums[s];
        //     nums[s] = nums[e];
        //     nums[e] = temp;
        //     s++;
        // }
        //     s= 0;
        //     e = nums.length-1;
        // }
            // int temp = nums[nums.length-1];
            // for(int j=nums.length-1;j>0;j--)
            // {
            //     nums[j] = nums[j-1];
            // }
            // nums[0] = temp;
        
//         }
//         soln3
//         int j = 0;
        
//         int result[] = new int[k];
//         for(int i = nums.length-k;i<=nums.length - 1;i++)
//         {
//             result[j] = nums[i];
//             j++;
//         }
//         for(int i = nums.length-k-1;i>=0;i--)
//         {
//             nums[i+k] = nums[i]; 
//         }
//         for(int i =0;i<k;i++)
//         {
//             nums[i] = result[i];
//         }
        
//         soln4
        int size = nums.length;
        int result[] = new int[size];
        for(int i=0;i<size;i++)
        {
            int temp = (i + k)%(size);
            result[temp] = nums[i];
            
        }
        for(int i =0;i<size;i++)
      {
             nums[i] = result[i];
         }
    }
}