# Bubble Sort Algorithm

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

## Algorithm Explanation

Given an input array:

```
[34, 12, 45, 3, 6, 7, 20]
```

Bubble Sort works by repeatedly swapping adjacent elements if they are out of order, moving the largest unsorted element to its correct position at the end.

## Animated Sorting Process



## Java Implementation

```java
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
```

## How to Run

1. Compile the Java file:
   ```sh
   javac BubbleSort.java
   ```
2. Run the Java program:
   ```sh
   java BubbleSort
   ```



## Example Walkthrough

```
Input Array: [34, 12, 45, 3, 6, 7, 20]
```

## Step-by-Step Sorting Process:

1. **First Pass**:
   - Compare 34 and 12 → Swap → `[12, 34, 45, 3, 6, 7, 20]`
   - Compare 34 and 45 → No swap
   - Compare 45 and 3 → Swap → `[12, 34, 3, 45, 6, 7, 20]`
   - Compare 45 and 6 → Swap → `[12, 34, 3, 6, 45, 7, 20]`
   - Compare 45 and 7 → Swap → `[12, 34, 3, 6, 7, 45, 20]`
   - Compare 45 and 20 → Swap → `[12, 34, 3, 6, 7, 20, 45]`

2. **Second Pass**:
   - Compare 12 and 34 → No swap
   - Compare 34 and 3 → Swap → `[12, 3, 34, 6, 7, 20, 45]`
   - Compare 34 and 6 → Swap → `[12, 3, 6, 34, 7, 20, 45]`
   - Compare 34 and 7 → Swap → `[12, 3, 6, 7, 34, 20, 45]`
   - Compare 34 and 20 → Swap → `[12, 3, 6, 7, 20, 34, 45]`

3. **Third Pass**:
   - Compare 12 and 3 → Swap → `[3, 12, 6, 7, 20, 34, 45]`
   - Compare 12 and 6 → Swap → `[3, 6, 12, 7, 20, 34, 45]`
   - Compare 12 and 7 → Swap → `[3, 6, 7, 12, 20, 34, 45]`
   - Compare 12 and 20 → No swap

4. **Fourth Pass**:
   - Compare 3 and 6 → No swap
   - Compare 6 and 7 → No swap
   - Compare 7 and 12 → No swap

5. **Fifth Pass**:
   - Compare 3 and 6 → No swap
   - Compare 6 and 7 → No swap

6. **Sixth Pass**:
   - Compare 3 and 6 → No swap

## Final Sorted Array:
```
After sort: 3 6 7 12 20 34 45
```# sorting-algorithms


## Time Complexity

| Case          | Time Complexity |
|---------------|-----------------|
| Best Case     | \( O(n) \)      |
| Average Case  | \( O(n^2) \)    |
| Worst Case    | \( O(n^2) \)    |

## Explanation:
- **Best Case**: Occurs when the array is already sorted. Bubble Sort makes one pass through the array to confirm no swaps are needed.
- **Average Case**: Occurs when the array is partially sorted. Multiple passes and swaps are required.
- **Worst Case**: Occurs when the array is sorted in reverse order. Maximum comparisons and swaps are required.

---

## Space Complexity

Bubble Sort is an **in-place sorting algorithm**, meaning it does not require additional memory proportional to the input size.  
**Space Complexity**: \( O(1) \).

---
