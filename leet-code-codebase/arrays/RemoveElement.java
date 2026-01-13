class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize k to 0 (number of elements not equal to val)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the element to the front
                k++; // Increment k
            }
        }
        return k;
    }
}