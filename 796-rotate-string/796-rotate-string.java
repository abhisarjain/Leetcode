// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(goal.length()!=s.length()) return false;
        
//         int i=0;
//         int j=0;
        
//         while(j<goal.length())
//         {
//             if(goal.charAt(j)!=s.charAt(0))
//             {
//                 j++;
//             }
//             else
//             {
//                 break;
//             }
//         }
//         if(j==goal.length())
//         {
//             return false;
//         }
        
//         while(i<s.length())
//         {
            
//             if(j==goal.length()-1 && s.charAt(i)==goal.charAt(j))
//             {
//                 i++;
//                 j=0;
//             }
//             else if(s.charAt(i)==goal.charAt(j))
//             {
//                 i++;
//                 j++;
//             }
//             else
//             {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }
class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}