class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m+n-1; i>=m;i--){
            if(m>0 && nums1[m-1]>nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            } else {
                nums1[i] = nums2[n-1];
                n--;
            }}
    }
}