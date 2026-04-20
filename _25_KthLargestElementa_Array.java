
import java.util.*;

class Solution {
    Random rand = new Random();

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];

        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = nums[pivotIndex];

        // 3-way partition
        int low = left, mid = left, high = right;

        while (mid <= high) {
            if (nums[mid] < pivot) {
                swap(nums, low++, mid++);
            } else if (nums[mid] > pivot) {
                swap(nums, mid, high--);
            } else {
                mid++;
            }
        }

        // now:
        // [left ... low-1] < pivot
        // [low ... high] == pivot
        // [high+1 ... right] > pivot

        if (k < low) {
            return quickSelect(nums, left, low - 1, k);
        } else if (k > high) {
            return quickSelect(nums, high + 1, right, k);
        } else {
            return pivot;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class _25_KthLargestElementa_Array {
     public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = obj.findKthLargest(nums, k);

        System.out.println("Kth largest element: " + result);
    }
}
