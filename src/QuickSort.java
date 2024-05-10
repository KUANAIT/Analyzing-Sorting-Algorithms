public class QuickSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
}

