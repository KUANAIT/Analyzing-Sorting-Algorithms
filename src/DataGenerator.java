import java.util.Arrays;
import java.util.Random;

public class DataGenerator {
    public static int[] generateRandomData(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++)
            data[i] = random.nextInt();
        return data;
    }

    public static int[] generateSortedData(int size) {
        int[] data = generateRandomData(size);
        Arrays.sort(data);
        return data;
    }

    public static int[] generateReverseSortedData(int size) {
        int[] data = generateSortedData(size);
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

