package jobsheet6;

public class sortmain {
        public static void main(String[] args) {
            sorting mergeSorting = new sorting();
            int[] data = {5, 2, 4, 6, 1, 3};
            System.out.println("Sorting by Merge Sort");
            System.out.println("Initial data");
            mergeSorting.printArray(data);
            mergeSorting.mergeSort(data);
            System.out.println("Sorted data");
            mergeSorting.printArray(data);
        }
    }   