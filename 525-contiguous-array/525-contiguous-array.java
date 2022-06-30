class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int result=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum = sum-1;;
            }
            else
            {
                sum = sum+1;;
            }
            if(sum==0)
            {
                result = Math.max(result,i+1);
            }
            else if(hm.containsKey(sum))
            {
                result = Math.max(result,i-hm.get(sum));
            }
            else
            {
                hm.put(sum,i);
            }
        }
        
        return result;
    }
}