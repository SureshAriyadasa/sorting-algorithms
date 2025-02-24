class QuickSort {
    // Function to perform QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high); // Get pivot position
            quickSort(arr, low, partitionIndex - 1);  // Sort left sub-array
            quickSort(arr, partitionIndex + 1, high); // Sort right sub-array
        }
    }

    // Partition function (using Lomuto partition scheme)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1; // Pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Place pivot at the correct position
        return i + 1;
    }

    // Swap function to exchange values
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int ar[] = {34, 12, 45, 3, 6, 7, 20}; // Sample input array
        quickSort(ar, 0, ar.length - 1); // Call QuickSort function
        System.out.print("After sort: ");
        for (int num : ar) {
            System.out.print(num + " "); // Print sorted array
        }
    }
}
public class MyQuickSort {
  
 
    private int quickSort(int[] array,int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
       
        while (i <= j) {
 
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
    int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(array,lowerIndex, j);
        if (i < higherIndex)
            quickSort(array,i, higherIndex);
		return -1;
    }

    public static void main(String a[]){
         
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.quickSort(input,0,input.length-1);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}