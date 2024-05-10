public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000};

        for (int size : sizes) {
            int[] randomData = DataGenerator.generateRandomData(size);
            int[] sortedData = DataGenerator.generateSortedData(size);
            int[] reverseSortedData = DataGenerator.generateReverseSortedData(size);

            long startTime, endTime;



            int[] QuickRandom = randomData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(QuickRandom);
            endTime = System.nanoTime();
            long quickRandomTime = endTime - startTime;

            int[] QuickSorted = sortedData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(QuickSorted);
            endTime = System.nanoTime();
            long quickSortedTime = endTime - startTime;

            int[] QuickReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            QuickSort.sort(QuickReverseSorted);
            endTime = System.nanoTime();
            long quickReverseSortedTime = endTime - startTime;


            int[] MergeRandom = randomData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(MergeRandom);
            endTime = System.nanoTime();
            long mergeRandomTime = endTime - startTime;

            int[] MergeSorted = sortedData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(MergeSorted);
            endTime = System.nanoTime();
            long mergeSortedTime = endTime - startTime;

            int[] MergeReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            MergeSort.sort(MergeReverseSorted);
            endTime = System.nanoTime();
            long mergeReverseSortedTime = endTime - startTime;


            int[] HeapRandom = randomData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(HeapRandom);
            endTime = System.nanoTime();
            long heapRandomTime = endTime - startTime;

            int[] HeapSorted = sortedData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(HeapSorted);
            endTime = System.nanoTime();
            long heapSortedTime = endTime - startTime;

            int[] HeapReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            HeapSort.sort(HeapReverseSorted);
            endTime = System.nanoTime();
            long heapReverseSortedTime = endTime - startTime;


            int[] InsertionRandom = randomData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(InsertionRandom);
            endTime = System.nanoTime();
            long insertionRandomTime = endTime - startTime;

            int[] InsertionSorted = sortedData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(InsertionSorted);
            endTime = System.nanoTime();
            long insertionSortedTime = endTime - startTime;

            int[] InsertionReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(InsertionReverseSorted);
            endTime = System.nanoTime();
            long insertionReverseSortedTime = endTime - startTime;


            int[] SelectionRandom = randomData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(SelectionRandom);
            endTime = System.nanoTime();
            long selectionRandomTime = endTime - startTime;

            int[] SelectionSorted = sortedData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(SelectionSorted);
            endTime = System.nanoTime();
            long selectionSortedTime = endTime - startTime;

            int[] SelectionReverseSorted = reverseSortedData.clone();
            startTime = System.nanoTime();
            SelectionSort.sort(SelectionReverseSorted);
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
