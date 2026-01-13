class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
         int left = 0;
        int right = nums.length - 1;

        // Binary search loop
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If target is found, return its index
            if (nums[mid] == target) {
                return mid;
            }
            // If target is less than the middle element, search the left half
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            // If target is greater than the middle element, search the right half
            else {
                left = mid + 1;
            }
        }

        // If target is not found, return the insertion position (left index)
        return left;
    }
}