
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean bool = false;
//         Map<Integer,Integer> result = new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
//              if(result.containsKey(nums[i]))
//             {
//                 bool = true;
//                 break;
//             }
//             result.put(nums[i],i);
           
//         }
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++)
        //  {
        //     if(nums[i]==nums[i+1])
        //     {
        //         bool = true;
        //     }
        // }
        // return bool;
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                bool = true;
                break;
            }
            hs.add(nums[i]);
        }
        
        return bool;
    }
}