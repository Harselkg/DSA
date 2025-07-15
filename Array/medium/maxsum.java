public class maxsum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;

        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) currentSum = 0;
        }

        return maxSum;
    }
}
