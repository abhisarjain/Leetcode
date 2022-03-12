class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int result[] = new int[s.length()];
       
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                 int value = hm.get(s.charAt(i));
                 hm.put(s.charAt(i),value+1);
                
                // hm.remove(s.charAt(i));
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        // System.out.println(hm);
        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
       // if(hm.isEmpty() == true){return -1;}
        // if(hm.isEmpty() == true){return -1;}
        // else
        // {
        //      Map.Entry<Character,Integer> entry = hm.entrySet().iterator().next();
        //     return entry.getValue();
        // }
    
      
    }
}