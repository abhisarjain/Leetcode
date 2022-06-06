class Solution {
    public int firstUniqChar(String s) {
//         LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
        
       
//         for(int i=0;i<s.length();i++)
//         {
//             if(hm.containsKey(s.charAt(i)))
//             {
//                  int value = hm.get(s.charAt(i));
//                  hm.put(s.charAt(i),value+1);
         
//             }
//             else
//             {
//                 hm.put(s.charAt(i),1);
//             }
//         }
       
//         for(int i=0;i<s.length();i++)
//         {
//             if(hm.get(s.charAt(i))==1)
//             {
//                 return i;
//             }
//         }
//         return -1;
    
        int arr[] = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {            
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] == 1) {
                return i;
            }
        }
        return -1;
      
    }
}