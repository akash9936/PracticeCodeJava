package src;

import java.util.HashSet;

public class DuplicateInt {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // Compare every pair of elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;  // Duplicate found
                }
            }
        }
        return false;  // No duplicates found
    }

    public static boolean containsDuplicateV1(int[] nums){
        HashSet<Integer> set= new HashSet<>();
        for(int num : nums){
//            If num is not already in the set, it will be added, and the method will return true.
//                    If num is already in the set (i.e., it's a duplicate), the method will return false
//            because HashSet does not allow duplicates.
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 3, 3, 3};
        System.out.println(containsDuplicateV1(nums1));  // Output: true

        // Test case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicateV1(nums2));  // Output: false
    }
}
