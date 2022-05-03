class Solution {
    public String reverseWords(String s) {
        
    int low = 0, high=s.length()-1;
   char[] r = s.toCharArray();
        for(int i=0;i<r.length;i++)
        {
            if(r[i]==' ')
            {
                reverse(r,low,i-1);
                low = i+1;
            }
        }
        reverse(r, low, high);
        return new String(r);
    
    
    }
    
     void reverse(char[] s,int low ,int x)
    {
        while(low<x)
        {
        char temp = s[low];
        s[low] = s[x];
        s[x] = temp;
        low++;
        x--;
        }
    }
    
  
}
// class Solution{
//    public String reverseWords(String s) {
        
//         char[] c = s.toCharArray();
//         int start = 0, end = 0;
//         for(; end < c.length; end++){
//             if(c[end] == ' '){
//                 reverse(c, start, end-1);
//                 start = end+1;
//             }
//         }
//         reverse(c, start, end-1);
//         return new String(c);
//     }
    
//     private void reverse(char[] c, int start, int end){
//         while(start < end){
//             char tmp = c[end];
//             c[end] = c[start];
//             c[start] = tmp;
//             start++;
//             end--;
//         }
//     }}