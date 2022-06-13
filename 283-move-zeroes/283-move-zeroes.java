class Solution {
    public void moveZeroes(int[] nums) {
//         int result[] = new int[nums.length];
//         int x=0,y=nums.length-1;
//         for (int i =0;i<=nums.length-1;i++)
//         {
//             if(nums[i]==0)
//             {
//                 result[y] = nums[i];
//                 y--;
//             }
//             else
//             {
//                 result[x] = nums[i];
//                 x++;
//             }
            
//         }
        
//         for(int i = 0;i<nums.length;i++)
//         {
//             nums[i] = result[i];
//         }
        
        
        int a = 0;
        int b = 1;
        while(b!=nums.length)
        {
            if(nums[a]==0 && nums[b]!=0)
            {
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b++;
            }
            else if(nums[b]==0 && nums[a]==0)
            {
                b++;
            }
            else if(nums[b]==0 && nums[a]!=0)
            {
                b++;
                a++;
            }
            else if(nums[b]!=0 && nums[a]!=0)
            {
                b++;
                a++;
            }
        }
    }
}