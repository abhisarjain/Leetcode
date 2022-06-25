class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].equals(""))
        {
            return "";
        }
        if(strs.length==1)
        {
            return strs[0];
        }
       String result = "";
        boolean bool=true;
        int j=0;
        while(bool==true)
        {
           
            for(int i=0;i<strs.length-1;i++)
            {
                if(j<strs[i].length() && j<strs[i+1].length() && strs[i].charAt(j)==strs[i+1].charAt(j)  )
                {
                    bool = true;
                }
                else
                {
                    bool=false;
                    return result;
                }
            }
            
            if(bool==true)
            {
                result = result + ("" + strs[0].charAt(j));
            }
            j++;
            
        }
return result;
        
        
    }
}