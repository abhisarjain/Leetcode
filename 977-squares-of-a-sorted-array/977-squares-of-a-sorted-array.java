class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int start = 0 , end = nums.length - 1;
        int temp[] = new int[nums.length];
        for(int i = temp.length-1;i>=0;i--)
        {
            if(Math.abs(nums[start]) < Math.abs(nums[end]))
            {
                temp[i] = (nums[end] * nums[end]);
                end--;
            }
            else
            {
                temp[i] = (nums[start] * nums[start]);
                start++;
            }
        }
        return(temp);
        
    }
}

























// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++)
//         {
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }