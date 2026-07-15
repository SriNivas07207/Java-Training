package Day23;

public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        MaximumAverageSubarray obj = new MaximumAverageSubarray();

        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println(obj.findMaxAverage(nums1, k1));

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println(obj.findMaxAverage(nums2, k2));
    }
}