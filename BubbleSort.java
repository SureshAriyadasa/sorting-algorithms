import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {34, 12, 45, 3, 6, 7, 20};
        sort(arr);
        System.out.print("After sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sort(int[] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
