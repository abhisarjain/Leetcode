 class Solution {
//     public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
//         int count = 0;
//         HashMap<Integer,Integer> hm = new HashMap<>();
        
//         for(int i = 0;i<a.length;i++)
//         {
//             for(int j = 0;j<a.length;j++)
//             {
//                 if(hm.containsKey((a[i]+b[j])))
//                 {
//                     hm.put((a[i]+b[j]),hm.get((a[i]+b[j]))+1);
//                 }
//                 else
//                 {
//                    hm.put((a[i]+b[j]),1); 
//                 }
                
//             }
//         }
        
//         for(int i = 0;i<a.length;i++)
//         {
//            for(int j = 0;j<a.length;j++)
//             {
//                 if(hm.containsKey(-(c[i]+d[j])))
//                 {
//                     count+=hm.get(-(c[i]+d[j]));
//                 }
//             } 
//         }
//         return count;
        
//     }
// }


public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<C.length; i++) {
        for(int j=0; j<D.length; j++) {
            int sum = C[i] + D[j];
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
    }
    
    int res=0;
    for(int i=0; i<A.length; i++) {
        for(int j=0; j<B.length; j++) {
            res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
        }
    }
    
    return res;
}
 }