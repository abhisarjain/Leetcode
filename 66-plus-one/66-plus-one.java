class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]+=1;
            return digits;
        }
        int i;
       for( i=digits.length-1;i>=0;i--)
       {
           if(digits[i]!=9)
           {
               digits[i]+=1;
               break;
           }
           else
           {
               digits[i] = 0;
           }
           
           
       }
        
        if(digits[0]==0)
        {
           int r[] = new int[digits.length+1];
            r[0] = 1;
            return r;
        }
        return digits;
    }
}