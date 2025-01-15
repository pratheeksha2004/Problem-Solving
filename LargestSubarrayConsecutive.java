import java.util.HashSet;

public class LargestSubarrayConsecutive {
    public static int findLargestSubarray(int[] arr) {
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            int minVal = arr[i], maxVal = arr[i];

            for (int j = i; j < arr.length; j++) {
                if (set.contains(arr[j])) break;

                set.add(arr[j]);
                minVal = Math.min(minVal, arr[j]);
                maxVal = Math.max(maxVal, arr[j]);

                if (maxVal - minVal == j - i) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 4, 3, 1, 0};
        System.out.println("Largest Subarray Length: " + findLargestSubarray(arr));
    }
}
