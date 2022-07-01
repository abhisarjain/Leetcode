class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        // List<Character> list = new ArrayList<Character>();
        HashSet<String> hs = new HashSet<String>();
        int i=0;
        int j=0;
        String temp = "";
        while(j<s.length())
        {
            // list.add(s.charAt(j));
            temp = temp + ("" + s.charAt(j));
            if((j-i+1)<10)
            {
                
                j++;
            }
            
            else if((j-i+1)==10)
            {
                if(!hs.contains(temp))
                {
                    hs.add(temp);
                }
                else
                {
                    if(!result.contains(temp))
                    {
                        result.add(temp);
                    }
                    
                }
                temp = temp.substring(1);
                i++;
                j++;
                
            }
        }
        return result;
    }
}