/**
 * Created by Henry on 2017/3/12.
 */
public class MedianOfTwoSoftedArrays {
    public static void main(String[] args){
        int[] a = {1, 2, 3 ,4};
        int[] b = {5, 6, 7, 8};
        double result = new MedianOfTwoSoftedArrays().findMedianSortedArrays(a, b);
        System.out.printf(result+"");

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if((m+n)%2 == 0){
            return ((getKthMin(nums1, 0,nums2, 0, (m+n)/2 ) + getKthMin(nums1, 0,nums2, 0, (m+n)/2 +1)))/2;

        }
        else
            return getKthMin(nums1, 0,nums2, 0, (m+n+1)/2);
    }
    public double getKthMin(int[] a, int aStart,int[] b, int bStart, int k){
        if(aStart > a.length -1)
            return b[bStart + k -1];
        if(bStart > b.length -1)
            return a[aStart + k -1];
        if(k ==1)
            return Math.min(a[aStart], b[bStart]);
        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if((aStart + k/2 -1) < a.length)
            aMid = a[aStart + k/2 -1];
        if((bStart + k/2 -1) < b.length)
            bMid = b[bStart + k/2 -1];
        if(aMid < bMid)
            return getKthMin(a, aStart + k/2, b, bStart, k - k/2);
        else
            return  getKthMin(a, aStart, b, bStart + k/2, k - k/2);

    }
}
