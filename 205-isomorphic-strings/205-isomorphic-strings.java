class Solution {
    public boolean isIsomorphic(String s, String t) {
       
        // HashSet<Character> h2 = new HashSet<Character>();
        
       
        // for(int i=0;i<s.length();i++)
        // {
        //     h1.add(s.charAt(i));
        // }
        //  for(int i=0;i<t.length();i++)
        // {
        //     h2.add(t.charAt(i));
        // }
        //  // System.out.print(h1.size());
        // if(h1.size()==h2.size())
        // {
        //     return true;
        // }
        if(func(s,t)==true && func(t,s)==true)
        {
            return true;
        }
        
        return false;
    }
    
    public boolean func(String s,String t)
    {
         HashMap<Character,Character> h1 = new HashMap<Character,Character>();
         for(int i=0;i<s.length();i++)
        {
            if(h1.containsKey(t.charAt(i)))
            {
                if(h1.get(t.charAt(i))!=s.charAt(i))
                {
                    return false;
                }
                else
                {
                    continue;
                }
            }
           h1.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}