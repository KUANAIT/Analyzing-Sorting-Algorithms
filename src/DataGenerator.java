import java.util.Arrays;
import java.util.Random;

public class DataGenerator {
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt();
        return arr;
    }

    public static int[] generateSortedArray(int size) {
        int[] data = generateRandomArray(size);
        Arrays.sort(data);
        return data;
    }

    public static int[] generateReverseSortedArray(int size) {
        int[] data = generateSortedArray(size);
        reverseArray(data);
        return data;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

