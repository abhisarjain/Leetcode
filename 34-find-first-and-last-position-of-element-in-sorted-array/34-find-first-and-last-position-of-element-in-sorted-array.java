class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j = nums.length-1;
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;  
        while(i<=j)
        {
            int mid = (i+j)/2;
            // if(i==j)
            // {
            //     break;
            // }
            if(target>nums[mid])
            {
                i = mid+1;
            }
            else if(target<nums[mid])
            {
                j = mid-1;
            }
            else
            {
                int a =mid;
                int b=mid;
                if(a==0)
                {
                    result[0] = a;
                }
                else
                {
                while(nums[a]==target)
                {
                    if(a==0 || nums[a-1]!=target )
                    {
                        result[0] = a;
                        break;
                    }
                    a--;
                } 
                }
    if(b==nums.length-1)
    {
        result[1] = b;
    }
                else
                {
                    while(nums[b]==target)
                {
                    if(b==nums.length-1 || nums[b+1]!=target)
                    {
                        result[1] = b;
                        break;
                    }
                    b++;
                }
                }
                
                return result;
            }
        }
        
        return result;
    }
}