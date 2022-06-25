class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                
                hm.put(nums[i],hm.get(nums[i]) + 1);
            }
            else
            {
                hm.put(nums[i],1);
            }
            
            
        }
        // System.out.println(hm);
        for(int x : hm.keySet())
        {
            if(hm.get(x)>nums.length/3)
            {
                list.add(x);
            }
        }
        
        return list;
    }
}