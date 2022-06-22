class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        
        Arrays.sort(nums);
        return(nums[nums.length-k]);
     
//         List<Integer> r = new ArrayList<Integer>();
//         int x=0;
//         for(int i=0;i<nums.length;i++)
//         {
//            r.add(nums[i]);
//         }
        
       
        
//         for(int i=0;i<k;i++)
//         {
//            x = func(r);
        
//         }
//         return x;
        
        
       
//     }
    
//     public int func(List<Integer> nums)
//     {
//         int max = nums.get(0);
//         for(int i=1;i<nums.size();i++)
//         {
//             if(nums.get(i)>max)
//             {
//                 max = nums.get(i);
//             }
//         }
//        nums.remove(Integer.valueOf(max));
//         return max;
    }
}