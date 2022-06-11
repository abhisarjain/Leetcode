class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> r = new HashMap<Integer,Integer>();
        for(int i = 0 ; i<nums.length; i++)
        {
            if(r.containsKey(nums[i]))
            {
                int temp = r.get(nums[i]);
                r.put((nums[i]),temp + 1);
            }
            else{
                 r.put(nums[i],1);
            }
           
        }
        // System.out.print(r);
        
        for(int x  : r.keySet())
        {
            if(r.get(x)>(nums.length/2))
            {
                return x;
            }
        }
        return -1;
    }
}