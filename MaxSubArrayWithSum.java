import java.util.HashMap;

public class MaxSubArrayWithSum {
    public static int findMaxLengthSubarray(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        map.put(0, -1); // Handle cases where subarray starts from index 0
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - target)) {
                maxLength = Math.max(maxLength, i - map.get(sum - target));
            }

            map.putIfAbsent(sum, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int target = 8;
        System.out.println("Maximum Length Subarray: " + findMaxLengthSubarray(arr, target));
    }
}
