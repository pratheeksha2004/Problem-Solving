public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                return Math.abs(nums[i]);
            }
            nums[index] = -nums[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        System.out.println("Duplicate element: " + findDuplicate(nums));
    }
}
