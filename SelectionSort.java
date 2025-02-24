class SelectionSort {
    public static void sort(int[] arr) {
        int temp, min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // Swap elements
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int ar[] = {34, 12, 45, 3, 6, 7, 20};
        sort(ar);
        System.out.print("After sort: ");
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }
    }
}
