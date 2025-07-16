public class task1 {
    public static int maxMinDifference(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] example = {3, 10, 6, 1, 8};
        System.out.println("Difference: " + maxMinDifference(example)); // Output: 9
    }
}
