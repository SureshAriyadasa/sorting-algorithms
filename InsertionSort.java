class InsertionSort {
    public static void sort(int[] arr) {
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int ar[] = {34, 12, 45, 3, 6, 7, 20};
        sort(ar);
        System.out.print("After sort: ");
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}