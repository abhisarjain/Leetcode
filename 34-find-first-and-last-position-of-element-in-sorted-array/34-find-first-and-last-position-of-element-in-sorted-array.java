// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int i=0;
//         int j = nums.length-1;
//         int result[] = new int[2];
//         result[0] = -1;
//         result[1] = -1;  
//         while(i<=j)
//         {
//             int mid = (i+j)/2;
            
//             if(target>nums[mid])
//             {
//                 i = mid+1;
//             }
//             else if(target<nums[mid])
//             {
//                 j = mid-1;
//             }
//             else
//             {
//                 int a =mid;
//                 int b=mid;
//                 if(a==0)
//                 {
//                     result[0] = a;
//                 }
//                 else
//                 {
//                 while(nums[a]==target)
//                 {
//                     if(a==0 || nums[a-1]!=target )
//                     {
//                         result[0] = a;
//                         break;
//                     }
//                     a--;
//                 } 
//                 }
//     if(b==nums.length-1)
//     {
//         result[1] = b;
//     }
//                 else
//                 {
//                     while(nums[b]==target)
//                 {
//                     if(b==nums.length-1 || nums[b+1]!=target)
//                     {
//                         result[1] = b;
//                         break;
//                     }
//                     b++;
//                 }
//                 }
                
//                 return result;
//             }
//         }
        
//         return result;
//     }
// }


public class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
}

private int findFirst(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
}

private int findLast(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
}
}