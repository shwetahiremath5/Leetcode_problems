
import java.util.HashSet;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // Store nums2 elements
        for (int num : nums2) {
            set2.add(num);
        }

        int count1 = 0;
        int count2 = 0;

        // Count elements in nums1 present in nums2
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }

        // Count elements in nums2 present in nums1
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}
public class _29_FindCommonElementsBetweenTwoArrays {
     public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        int[] result = obj.findIntersectionValues(nums1, nums2);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }

}
