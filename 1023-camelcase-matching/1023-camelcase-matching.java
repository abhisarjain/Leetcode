class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<Boolean>();
        
        
        
        for(int a=0;a<queries.length;a++)
        {
            int i = 0;
            int j = 0;
            boolean t = true;
            while(j<pattern.length() || i<queries[a].length())
            {
                if(j==pattern.length())
                {
                    if(queries[a].charAt(i)>='A' && queries[a].charAt(i)<='Z')
                    {
                        t= false;
                        break;
                    }
                    i++;
                }
                else
                {
                      if(i<queries[a].length() && queries[a].charAt(i)==pattern.charAt(j))
                {
                    i++;
                    j++;
                }
                else if(i<queries[a].length() &&(pattern.charAt(j)>='A' && pattern.charAt(j)<='Z') && !(queries[a].charAt(i)>='A' && queries[a].charAt(i)<='Z'))
                {
                    i++;
                }
                    else if(i<queries[a].length() &&!(pattern.charAt(j)>='A' && pattern.charAt(j)<='Z') && !(queries[a].charAt(i)>='A' && queries[a].charAt(i)<='Z'))
                    {
                        i++;
                    }
                else
                {
                    t = false;
                    break;
                }
                }
                
              
                
            }
            
            list.add(t);
            // System.out.println(list);
        }
        return list;
    }
}