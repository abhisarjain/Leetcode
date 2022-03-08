class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // int first = 0;
        // int second = 0;
        // int m = nums1.length;
        // int n = nums2.length;
        // int count=0;
        // if(m>n){
        //     int result[] = new int[n];
        // }
        // else{
        //     int result[] = new int[m];
        // }
        // int result[] = new int[m];
        
        
//         while(first<m && second< n)
//         {
//             if(nums1[first]!=nums2[second])
//             {
                
//                 if(m>n)
//                 {
//                 first++;
//                 }
//         else if(m<n)
//         {
//             second++;
//         }
//                 else{
//                     first++;
//                     second++;
//                 }
//             }
            
//             else if(nums1[first]==nums2[second])
//             {
                
//                 result.add(nums1[first]) ;
//                 first++;
//                 second++;
//                 // count++;
//             }
//         }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map <Integer,Integer> set = new HashMap<>();
        Map <Integer,Integer> set2 = new HashMap<>();
        
        for(int x : nums1)
        {
            if(set.containsKey(x))
            {
                int temp = set.get(x);
                set.put(x,temp+1);
            }
            
            else{
                set.put(x,1);
            }
            
        }
          for(int x : nums2)
        {
            if(set2.containsKey(x))
            {
                int temp = set2.get(x);
                set2.put(x,temp+1);
            }
            
            else{
                set2.put(x,1);
            }
            
        }
        
        for(int i : set.keySet())
        {
            if(set2.containsKey(i)){
                int t = Math.min(set2.get(i),set.get(i));
                for(int a =0;a<t;a++)
                {
                    result.add(i);
                }
                
            }
        }
        
//         for(int x : nums2)
//         {
//             if(set.contains(x))
//             {
//                 result.add(x);
                
//             }
//         }
        
        
        
        int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           r[i] = result.get(i);
       }
        return (r);
    }
}