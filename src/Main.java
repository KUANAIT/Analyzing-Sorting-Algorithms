public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000};

        for (int size : sizes) {
            int[] randomData = DataGenerator.generateRandomData(size);
            int[] sortedData = DataGenerator.generateSortedData(size);
            int[] reverseSortedData = DataGenerator.generateReverseSortedData(size);

            long startTime, endTime;



            int[] copyQuickRandom = randomData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(copyQuickRandom);
            endTime = System.nanoTime();
            long quickRandomTime = endTime - startTime;

            int[] copyQuickSorted = sortedData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(copyQuickSorted);
            endTime = System.nanoTime();
            long quickSortedTime = endTime - startTime;

            int[] copyQuickReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(copyQuickReverseSorted);
            endTime = System.nanoTime();
            long quickReverseSortedTime = endTime - startTime;


            int[] copyMergeRandom = randomData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(copyMergeRandom);
            endTime = System.nanoTime();
            long mergeRandomTime = endTime - startTime;

            int[] copyMergeSorted = sortedData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(copyMergeSorted);
            endTime = System.nanoTime();
            long mergeSortedTime = endTime - startTime;

            int[] copyMergeReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(copyMergeReverseSorted);
            endTime = System.nanoTime();
            long mergeReverseSortedTime = endTime - startTime;


            int[] copyHeapRandom = randomData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(copyHeapRandom);
            endTime = System.nanoTime();
            long heapRandomTime = endTime - startTime;

            int[] copyHeapSorted = sortedData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(copyHeapSorted);
            endTime = System.nanoTime();
            long heapSortedTime = endTime - startTime;

            int[] copyHeapReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(copyHeapReverseSorted);
            endTime = System.nanoTime();
            long heapReverseSortedTime = endTime - startTime;


            int[] copyInsertionRandom = randomData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(copyInsertionRandom);
            endTime = System.nanoTime();
            long insertionRandomTime = endTime - startTime;

            int[] copyInsertionSorted = sortedData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(copyInsertionSorted);
            endTime = System.nanoTime();
            long insertionSortedTime = endTime - startTime;

            int[] copyInsertionReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(copyInsertionReverseSorted);
            endTime = System.nanoTime();
            long insertionReverseSortedTime = endTime - startTime;


            int[] copySelectionRandom = randomData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(copySelectionRandom);
            endTime = System.nanoTime();
            long selectionRandomTime = endTime - startTime;

            int[] copySelectionSorted = sortedData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(copySelectionSorted);
            endTime = System.nanoTime();
            long selectionSortedTime = endTime - startTime;

            int[] copySelectionReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(copySelectionReverseSorted);
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
