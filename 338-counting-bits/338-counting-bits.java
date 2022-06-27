class Solution {
    public int[] countBits(int n) {
        int r[] = new int[n+1];
        int j=0;
        for(int i=0;i<=n;i++)
        {
            // System.out.println(i);
            int count=0;
            int num = i;
            while(num>0)
            {
                int x = num%2;
                if(x==1)
                {
                    count++;
                }
                num=num/2;
            }
            r[j] = count;
            // System.out.println(r[j]);
            j++;
        }
        
        return r;
    }
}