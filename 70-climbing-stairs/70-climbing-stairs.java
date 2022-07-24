class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        for(int i =0;i<dp.length;i++) 
        {
            dp[i] = -1;
        }
        return func(n,dp);
    }
    
    public int func(int n,int[] dp)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 1;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n] = func(n-1,dp) + func(n-2,dp);
    }
}