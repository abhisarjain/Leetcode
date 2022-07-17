class Solution {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a.length;j++)
            {
                if(hm.containsKey((a[i]+b[j])))
                {
                    hm.put((a[i]+b[j]),hm.get((a[i]+b[j]))+1);
                }
                else
                {
                   hm.put((a[i]+b[j]),1); 
                }
                
            }
        }
        
        for(int i = 0;i<a.length;i++)
        {
           for(int j = 0;j<a.length;j++)
            {
                if(hm.containsKey(-(c[i]+d[j])))
                {
                    count+=hm.get(-(c[i]+d[j]));
                }
            } 
        }
        return count;
        
    }
}