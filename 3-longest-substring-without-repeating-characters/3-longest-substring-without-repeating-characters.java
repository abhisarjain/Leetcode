class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
         if(s.length()==1)
        {
            return 1;
        }
       
        // System.out.print(s.length());
            
        int x=0;
        int max=0;
        int curr=0;
            
       HashSet<Character> hs= new HashSet();
//         for(int i =0 ; i <s.length();i++)
//         {
            
//             String temp = "" + s.charAt(i);
//             if(sub.contains(temp))
//             {
//                 x = Math.max(sub.length(),x);
//                 sub = temp;
                
//             }
//             else
//             {
//                 sub = sub + temp;
                
                    
//             }
//             if(i==s.length()-1 && x<sub.length())
//             {
//                 x = sub.length();
//             }
//         }
//         // System.out.println(sub);
//         // System.out.println(s);
//         if(sub.equals(s))
//             {
//                 x = s.length();
//             }
        // System.out.print(x);
        
        
        while(curr<s.length())
        {
         
            if(!hs.contains(s.charAt(curr))){
                hs.add(s.charAt(curr));
                curr++;
                x= Math.max(hs.size(),x);
            }else{
                hs.remove(s.charAt(max));
                max++;
            }
        }
            
            
            
            
            
            
            
        
        return x;
    }
}