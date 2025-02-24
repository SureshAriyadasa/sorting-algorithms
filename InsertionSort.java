class InsertionSort {
    // Method to perform Insertion Sort
    public static void sort(int[] arr) {
        int key, j;
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            key = arr[i]; // Store the current element to be positioned correctly
            j = i - 1;
            
            // Shift elements of the sorted portion of the array to the right 
            // if they are greater than the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Move element one position ahead
                j--;
            }
            arr[j + 1] = key; // Place the key at its correct position
        }
    }

    public static void main(String[] args) {
        int ar[] = {34, 12, 45, 3, 6, 7, 20}; // Sample array to be sorted
        sort(ar); // Call the sorting function

        System.out.print("After sort: ");
        for (int num : ar) {
            System.out.print(num + " "); // Print the sorted array
        }
    }
}