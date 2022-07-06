class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<Integer>();
        int[] result =  new int[nums1.length];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        
        
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(s.isEmpty())
            {
                hm.put(nums2[i],-1);
            }
            else if(s.peek()>nums2[i])
            {
                hm.put(nums2[i],s.peek());
            }
            
            else if(s.peek()<nums2[i])
            {
                while(!s.isEmpty() && s.peek()<=nums2[i])
                {
                    s.pop();
                }
                
                if(s.isEmpty())
                {
                    hm.put(nums2[i],-1);
                }
                else
                {
                    hm.put(nums2[i],s.peek());
                }
            }
            
            s.push(nums2[i]);
        }
        // System.out.print(hm);
        
        for(int i=0;i<nums1.length;i++)
        {
            result[i] = hm.get(nums1[i]);
        }
        
        return result;
        
    }
}