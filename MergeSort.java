import java.util.*;

public class MergeSort {
    public static void mergeS(int[] arr) {
        if (arr.length > 1) {
            int left[] = leftHalf(arr);
            int right[] = rightHalf(arr);
            mergeS(left);
            mergeS(right);
            merge(arr, left, right);
        }
    }

    public static int[] leftHalf(int arr[]) {
        int size1 = arr.length / 2;
        int left[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = arr[i];
        }
        return left;
    }

    public static int[] rightHalf(int arr[]) {
        int size1 = arr.length / 2;
        int size2 = arr.length - size1;
        int right[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = arr[i + size1];
        }
        return right;
    }

    public static void merge(int result[], int left[], int right[]) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = {50, 3, 2, 8, 90, 12, 26, 1};
        mergeS(ar);
        System.out.println("After sort: " + Arrays.toString(ar));
    }
}