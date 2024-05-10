public class MergeSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    private static void merge(int[] arr, int low, int m, int h) {
        int[] temp = new int[h - low + 1];
        int i = low, j = m + 1, k = 0;
        while (i <= m && j <= h) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i <= m)
            temp[k++] = arr[i++];
        while (j <= h)
            temp[k++] = arr[j++];
        for (int l = 0; l < temp.length; l++)
            arr[low + l] = temp[l];
    }
}

