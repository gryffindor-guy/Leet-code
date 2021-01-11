public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int i=0;
        int j=0;
        int x=0;
        int[] result=new int[a+b];   
        while(i<a && j<b){
            if(nums1[i]<nums2[j]){
                result[x++]=nums1[i++];
            }
            else{
                result[x++]=nums2[j++];
            }
        }
        while(i<a){
            result[x++] = nums1[i++];
        }
        while(j<b){
            result[x++] = nums2[j++];
        }
        if((a+b)%2!=0){
            return (double) result[(a+b)/2];
        }
        else{
           return (double) (result[(a+b - 1) / 2] + result[(a+b) / 2]) / 2.0;
        }
    }
}
