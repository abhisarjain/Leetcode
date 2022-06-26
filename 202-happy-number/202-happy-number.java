class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> hs = new HashSet<Integer>();
        // int x = sos(n);
        // System.out.println(x);
        
//         // if(isHappy(x)==true) return true;
//         if(x==1)
//         {
//             return true;
//         }
       
//         return false;
        
        while(n!=1)
        {
            n = sos(n);
            if(n==1)
            {
                return true;
            }
            if(hs.contains(n))
            {
                return false;
            }
            else
            {
                hs.add(n);
            }
        }
        
        return false;
        
        
        
    }
    
    public int sos(int n)
    {
        int result = 0;
        while(n>0)
        {
        int temp = n%10;
        result = result + (temp*temp);
        n = n/10;
        }
       return result;
    }
}