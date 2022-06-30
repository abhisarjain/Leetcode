// class Solution {
//     public int findMaxLength(int[] nums) {
//         int sum=0;
//         int result=0;
//         HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==0)
//             {
//                 sum = sum-1;;
//             }
//             else
//             {
//                 sum = sum+1;;
//             }
//             if(sum==0)
//             {
//                 result = Math.max(result,i+1);
//             }
//             else if(hm.containsKey(sum))
//             {
//                 result = Math.max(result,i-hm.get(sum));
//             }
//             else
//             {
//                 hm.put(sum,i);
//             }
//         }
        
//         return result;
//     }
// }
public class Solution {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
