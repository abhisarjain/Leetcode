class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        // List<Integer> temp = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) {              
            continue;
        }
            int s = i + 1;
            int l = nums.length-1;
            
            while(s<l)
            {
                int sum = nums[i] + nums[s] + nums[l];
                if(sum == 0)
                {
                    // List<Integer> temp = new ArrayList<Integer>();
                    // temp.add(nums[i]);
                    // temp.add(nums[s]);
                    // temp.add(nums[l]);
                    
                    // if(!r.contains(Arrays.asList(nums[i], nums[s], nums[l])))
                    // {
                        // r.add(temp);
                        r.add(Arrays.asList(nums[i], nums[s], nums[l]));
                    // }
                    s++;
                    l--;
                while (s < l && nums[s] == nums[s - 1]) s++; 
                while (s < l && nums[l] == nums[l + 1]) l--;
                }
                
                else if(sum > 0)
                {
                    l--;
                }
                else
                {
                    s++;
                }
            }
        }
        return r;
    }
}