public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000};

        for (int size : sizes) {
            int[] randomData = DataGenerator.generateRandomArray(size);
            int[] sortedData = DataGenerator.generateSortedArray(size);
            int[] reverseSortedData = DataGenerator.generateReverseSortedArray(size);

            long startTime, endTime;



            int[] quickRandom = randomData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(quickRandom);
            endTime = System.nanoTime();
            long quickRandomTime = endTime - startTime;

            int[] quickSorted = sortedData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(quickSorted);
            endTime = System.nanoTime();
            long quickSortedTime = endTime - startTime;

            int[] quickReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(quickReverseSorted);
            endTime = System.nanoTime();
            long quickReverseSortedTime = endTime - startTime;


            int[] mergeRandom = randomData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(mergeRandom);
            endTime = System.nanoTime();
            long mergeRandomTime = endTime - startTime;

            int[] mergeSorted = sortedData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(mergeSorted);
            endTime = System.nanoTime();
            long mergeSortedTime = endTime - startTime;

            int[] mergeReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(mergeReverseSorted);
            endTime = System.nanoTime();
            long mergeReverseSortedTime = endTime - startTime;


            int[] heapRandom = randomData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(heapRandom);
            endTime = System.nanoTime();
            long heapRandomTime = endTime - startTime;

            int[] heapSorted = sortedData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(heapSorted);
            endTime = System.nanoTime();
            long heapSortedTime = endTime - startTime;

            int[] heapReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(heapReverseSorted);
            endTime = System.nanoTime();
            long heapReverseSortedTime = endTime - startTime;


            int[] insertionRandom = randomData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(insertionRandom);
            endTime = System.nanoTime();
            long insertionRandomTime = endTime - startTime;

            int[] insertionSorted = sortedData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(insertionSorted);
            endTime = System.nanoTime();
            long insertionSortedTime = endTime - startTime;

            int[] insertionReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(insertionReverseSorted);
            endTime = System.nanoTime();
            long insertionReverseSortedTime = endTime - startTime;


            int[] selectionRandom = randomData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(selectionRandom);
            endTime = System.nanoTime();
            long selectionRandomTime = endTime - startTime;

            int[] selectionSorted = sortedData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(selectionSorted);
            endTime = System.nanoTime();
            long selectionSortedTime = endTime - startTime;

            int[] selectionReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(selectionReverseSorted);
            endTime = System.nanoTime();
            long selectionReverseSortedTime = endTime - startTime;


            System.out.println("Size: " + size);

            System.out.println("Quick Sort - Random: " + quickRandomTime + " ns");
            System.out.println("Quick Sort - Sorted: " + quickSortedTime + " ns");
            System.out.println("Quick Sort - Reverse Sorted: " + quickReverseSortedTime + " ns");

            System.out.println("Merge Sort - Random: " + mergeRandomTime + " ns");
            System.out.println("Merge Sort - Sorted: " + mergeSortedTime + " ns");
            System.out.println("Merge Sort - Reverse Sorted: " + mergeReverseSortedTime + " ns");

            System.out.println("Heap Sort - Random: " + heapRandomTime + " ns");
            System.out.println("Heap Sort - Sorted: " + heapSortedTime + " ns");
            System.out.println("Heap Sort - Reverse Sorted: " + heapReverseSortedTime + " ns");

            System.out.println("Insertion Sort - Random: " + insertionRandomTime + " ns");
            System.out.println("Insertion Sort - Sorted: " + insertionSortedTime + " ns");
            System.out.println("Insertion Sort - Reverse Sorted: " + insertionReverseSortedTime + " ns");

            System.out.println("Selection Sort - Random: " + selectionRandomTime + " ns");
            System.out.println("Selection Sort - Sorted: " + selectionSortedTime + " ns");
            System.out.println("Selection Sort - Reverse Sorted: " + selectionReverseSortedTime + " ns");

            System.out.println("-------------------------------------");
        }
    }
}
