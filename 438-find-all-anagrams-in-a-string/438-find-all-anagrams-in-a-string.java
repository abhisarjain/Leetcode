class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0 ;
        int j = 0 ;
        int k = p.length();
        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int a=0;a<k;a++)
        {
            if(hm1.containsKey(p.charAt(a)))
            {
                hm1.put(p.charAt(a),hm1.get(p.charAt(a))+1);
            }
            else
            {
                hm1.put(p.charAt(a),1);
            }
        }
        
        
        // HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
        int count = hm1.size();
        while(j<s.length())
        {
            // if(hm2.containsKey(s.charAt(j)))
            // {
            //     hm2.put(s.charAt(j),hm2.get(s.charAt(j))+1);
            // }
            // else
            // {
            //     hm2.put(s.charAt(j),1);
            // }
            if(hm1.containsKey(s.charAt(j)))
            {
                hm1.put(s.charAt(j),hm1.get(s.charAt(j))-1);
                if(hm1.get(s.charAt(j))==0)
                {
                    count--;
                }
            }
            
            if((j-i+1)<k)
            {
                j++;
            }
            
            else if((j-i+1)==k)
            {
                // if(hm2.equals(hm1))
                // {
                //     result.add(i);
                // }
                // if(hm2.get(s.charAt(i))>1)
                // {
                //      hm2.put(s.charAt(i),hm2.get(s.charAt(i))-1);
                // }
                // else
                // {
                //     hm2.remove(s.charAt(i));
                // }
                
                if(count==0) result.add(i);
                
                if(hm1.containsKey(s.charAt(i)))
                {
                    hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
                    if(hm1.get(s.charAt(i))==1)
                    {
                        count++;
                    }
                }
                i++;
                j++;
               
            }
        }
        return result; 
    }
}