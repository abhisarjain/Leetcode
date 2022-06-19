class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        String a = func(s);
        String b = func(t);
       
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }
    
    public String func(String s)
    {
        // int x = s.length()-1;
        int count = 0;
        String result="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='#')
            {
                count++;
                // s.replace(("" + s.charAt(i)),"");
            }
            
            else
            {
                if(count!=0)
                {
                    // s.replace(("" + s.charAt(i)),"");
                    count--;
                }
                else
                {
                    result = result + ("" + s.charAt(i));
                }
            }
             // System.out.println(result);
        }
        return result;
    }
}