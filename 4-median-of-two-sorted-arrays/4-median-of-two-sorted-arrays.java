class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length + nums2.length];
        double median;
        for(int i=0;i<nums1.length;i++)
        {
            result[i] = nums1[i];
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            result[nums1.length +  i] = nums2[i];
        }
        
        Arrays.sort(result);
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