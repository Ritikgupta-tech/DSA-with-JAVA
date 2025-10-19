public class RotatedArraySearch {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found target
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target in left half
                } else {
                    left = mid + 1; // Target in right half
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target in right half
                } else {
                    right = mid - 1; // Target in left half
                }
            }
        }

        // Target not found
        return -1;
    }

    // Test the function
    public static void main(String[] args) {
        RotatedArraySearch solution = new RotatedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = solution.search(nums, target);
        System.out.println("Index of target: " + index);  // Output: 4
    }
}
