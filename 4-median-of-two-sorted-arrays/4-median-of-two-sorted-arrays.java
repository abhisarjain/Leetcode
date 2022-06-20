class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length + nums2.length];
        double median;
//         for(int i=0;i<nums1.length;i++)
//         {
//             result[i] = nums1[i];
//         }
        
//         for(int i=0;i<nums2.length;i++)
//         {
//             result[nums1.length +  i] = nums2[i];
//         }
        
//         Arrays.sort(result);
        int i = nums1.length-1;
        int j= nums2.length-1;
        int k = nums1.length + nums2.length -1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                result[k] = nums1[i];
                k--;
                i--;
            }
            else
            {
                result[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(i>=0)
        {
            result[k] = nums1[i];
            k--;
            i--;
        }
        while(j>=0)
        {
            result[k] = nums2[j];
            k--;
            j--;
        }
        // for(int x=0;x<result.length;x++)
        // {
        //     System.out.println(result[x]);
        // }
        
        double a = result[result.length/2];
        double b = result[(result.length-1)/2];
        if(result.length%2==0)
        {
        
            median = (a+b)/2;
        }
        
        else
        {
            median = a;
        }
        return median;
    }
}