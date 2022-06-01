class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int start = 0, end = nums.length-1;
          int result[] = new int[2];
//         while(start<end)
//         {
//             if(nums[start] + nums[end] > target)
//             {
//                 end--;
//             }
//             else if(nums[start] + nums[end] < target)
//             {
//                 start++;
//             }
//             else{
//                 result[0] = start;
//                 result[1] = end;
//                 break;
//             }
//         }
        
//         return (result);
        
//         for(int i =0 ;i<nums.length;i++)
//         {
//             for (int j = i+1; j<nums.length;j++)
//             {
//                 if(nums[i] + nums[j] == target)
//                 {
//                     result[0] = i;
//                     result[1] = j;
//                     break;
//                 }
//             }
//         }
        
//         return (result);
        
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {
                result[0] = hs.get(target-nums[i]);
                result[1] = i;
                break;
            }
            hs.put(nums[i],i);
            
        }
        return result;
    }
}
































// import java.util.*;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Scanner sc = new Scanner(System.in);
//         int result[] = new int[2];
//         Map<Integer,Integer> number = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             // nums[i] = sc.nextInt();
//             number.put(nums[i],i);
//         }
//         // System.out.println(number);

//         for (int i = 0; i < nums.length; i++) {
//             int index = target - nums[i];
//             if(number.containsKey(index))
//             {
//                 if( (number.get(index)) == i )
//                 {
//                     continue;
//                 }
//                 result[0] = i;
//                 result[1] = number.get(index);
               
//                 // System.out.println(number.get(nums[i])+","+number.get(target - nums[i]));
//                 // break;
//                 return result;
//             }
//             // else{
//             //     continue;
//             // }

//         }
        
//         return result;
        
//     }
//     public static void main(String[] args) {
//         Solution obj = new Solution();
        
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
        
//         int arr[] = new int[size];
//         int x[] = new int[2];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//             // number.put(nums[i],i);
//         }
//         int target = sc.nextInt();

//         x = obj.twoSum(arr,target);
//         System.out.println(x[0]+","+x[1]);
        
//     }
// }