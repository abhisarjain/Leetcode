class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int result[] = new int[nums.length];
        left[0]=1;
        for(int i=1;i<left.length;i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }
        right[right.length-1] = 1;
        for(int i =right.length-2;i>=0;i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }
        
        for(int i=0;i<result.length;i++)
        {
            result[i] = left[i]*right[i];
        }
        return result;
    }
}