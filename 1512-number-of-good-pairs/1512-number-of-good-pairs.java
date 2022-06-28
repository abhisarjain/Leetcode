class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int count=0;
        for(int i : hm.keySet() )
        {
            if(hm.get(i)>1)
            {
                count += (hm.get(i)*(hm.get(i)-1))/2; 
            }
        }
        return count;
    }
}