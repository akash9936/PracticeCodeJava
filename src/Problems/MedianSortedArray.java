//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//        The overall run time complexity should be O(log (m+n)).
//
//
//
//        Example 1:
//
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//        Example 2:
//
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

package src.Problems;

public class MedianSortedArray {
    public static void main(String arga[]){
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};


        System.out.println(getMedianSortedArray(nums1,nums2));


    }

    public static double getMedianSortedArray(int[] nums1,int[] nums2){
        int nums1Poniter=0;
        int nums2Poniter=0;
        int totalLength=nums1.length+nums2.length;
        int[] nums3= new int[nums1.length+nums2.length];
        int minLength=nums1.length<nums2.length?nums1.length:nums2.length;

        for(int i=0;i<minLength;i++){
            if(nums1[nums1Poniter]<nums2[nums2Poniter]){
                System.out.println(nums1[nums1Poniter]);
                nums3[i]=nums1[nums1Poniter];
                nums1Poniter++;
            }
            else {
                nums3[i] = nums2[nums2Poniter];
                System.out.println(nums2[nums2Poniter]);
                nums2Poniter++;
            }
        }
        while (nums1Poniter<nums1.length){
            nums3[minLength]=nums1[nums1Poniter];
            System.out.println(nums1[nums1Poniter]);

            nums1Poniter++;
            minLength++;
        }
        while (nums2Poniter<nums2.length){
            nums3[minLength]=nums2[nums2Poniter];
            System.out.println(nums2[nums2Poniter]);

            minLength++;
            nums2Poniter++;
        }
        double mid=0.0;
        if(nums3.length%2!=0){
            int t=totalLength/2;
            mid=nums3[t];
            System.out.println("mid 1 is "+mid);
        }
        else{
            mid=(nums3[(totalLength/2)-1]+nums3[(totalLength/2)])/2.0;
            System.out.println("mid 2 is "+nums3[(totalLength/2)-1]+" and "+nums3[(totalLength/2)]+
            " and "+(2+3)/2.0);

        }
        return mid;
    }
}
