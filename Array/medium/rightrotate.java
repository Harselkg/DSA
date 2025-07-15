public class rightrotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int a = k % n;

        reverse(nums, n - a, n - 1);
        reverse(nums, 0, n - a - 1);
        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

    // ✅ Test it with a main method
    public static void main(String[] args) {
        rightrotate s = new rightrotate();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        s.rotate(nums, k);

        // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}



