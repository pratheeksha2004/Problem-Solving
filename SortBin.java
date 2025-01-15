import java.util.Arrays;

public class SortBin {
    public static void sortBinaryArray(int[] arr) {
        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[zeroIndex++] = 0;
            }
        }
        for (int i = zeroIndex; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1};
        sortBinaryArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
