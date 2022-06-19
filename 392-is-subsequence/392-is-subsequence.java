class Solution {
    public boolean isSubsequence(String s, String t) {
       
        if(s.length()>t.length())
        {
            return false;
        }
        if(s.equals(""))
        {
            return true;
        }
         // System.out.println("hello");
        // System.out.println("'"+s+"'");
        
        int l=0;
        int count=0;
        for(int i=0;i<t.length();i++)
        {
            if(l==s.length())
            {
                break;
            }
            if( t.charAt(i)==s.charAt(l))
            {
                count++;
                l++;
                
            }
            
        }
        
        if(count==s.length())
        {
            return true;
        }
        return false;
        
    }
}