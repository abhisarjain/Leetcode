class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
//         List<List<String>> result = new ArrayList<List<String>>();
//         HashSet<String> seen = new HashSet<String>();
        
//         for(int i=0;i<strs.length;i++)
//         {
//             if(!seen.contains(strs[i])) 
//             {
//                 List<String> temp = new ArrayList<String>();
//                 temp.add(strs[i]);
//                 if(!strs[i].equals(""))
//                 {
//                    seen.add(strs[i]); 
//                 }
                
//                 for(int j=i+1;j<strs.length;j++)
//                 {
//                     if((!seen.contains(strs[j]) || strs[i].equals(strs[j])) && isAnagram(strs[i],strs[j]))
//                     {
//                         temp.add(strs[j]);
//                         // if(!strs[i].equals("")){}
//                         seen.add(strs[j]);
//                     }
                
                
//                 }
                
//                 result.add(temp);
//             }

//         }
        
//         return result;
        
        
//     }
    
    
//     public boolean isAnagram(String s, String t) {
//         int[] arr = new int[26];

//         if(s.length()!=t.length())
//         {
//             return false;
//         }
//          for (int i = 0; i < t.length(); i++) {
//              arr[t.charAt(i) - 'a']++;
//          }
//         for(int i=0;i<s.length();i++)
//         {
//             if(arr[s.charAt(i)-'a']==0)
//             {
//                 return false;
//             }
//             arr[s.charAt(i) - 'a']--;
            
//         }
//         return true;
     
//     }
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}