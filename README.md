# 1. Bubble Sort Algorithm

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

## Algorithm Explanation

Given an input array:

```
[34, 12, 45, 3, 6, 7, 20]
```

Bubble Sort works by repeatedly swapping adjacent elements if they are out of order, moving the largest unsorted element to its correct position at the end.


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
```

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

# 2. Selection Sort Algorithm

Selection Sort is a simple sorting algorithm that divides the input list into two parts: a sorted and an unsorted section. It repeatedly selects the smallest element from the unsorted section and swaps it with the first unsorted element.

## Algorithm Explanation

Given an input array:

```
[34, 12, 45, 3, 6, 7, 20]
```

Selection Sort works by finding the minimum element from the unsorted section and swapping it with the first unsorted element.


## Java Implementation

```java
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
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}
```

## How to Run

1. Compile the Java file:
   ```sh
   javac SelectionSort.java
   ```
2. Run the Java program:
   ```sh
   java SelectionSort
   ```

## Example Walkthrough

```
Input Array: [34, 12, 45, 3, 6, 7, 20]
```

## Step-by-Step Sorting Process:

1. **First Pass**:
   - Find the smallest number (3) and swap with 34 → `[3, 12, 45, 34, 6, 7, 20]`
2. **Second Pass**:
   - Find the smallest number (6) and swap with 12 → `[3, 6, 45, 34, 12, 7, 20]`
3. **Third Pass**:
   - Find the smallest number (7) and swap with 45 → `[3, 6, 7, 34, 12, 45, 20]`
4. **Fourth Pass**:
   - Find the smallest number (12) and swap with 34 → `[3, 6, 7, 12, 34, 45, 20]`
5. **Fifth Pass**:
   - Find the smallest number (20) and swap with 34 → `[3, 6, 7, 12, 20, 45, 34]`
6. **Sixth Pass**:
   - Find the smallest number (34) and swap with 45 → `[3, 6, 7, 12, 20, 34, 45]`

## Final Sorted Array:
```
After sort: 3 6 7 12 20 34 45
```

## Time Complexity

| Case          | Time Complexity |
|--------------|----------------|
| Best Case    | \( O(n^2) \)    |
| Average Case | \( O(n^2) \)    |
| Worst Case   | \( O(n^2) \)    |

## Explanation:
- **Best Case**: Selection Sort always goes through \( O(n^2) \) operations, even if the array is already sorted.
- **Average Case**: The same complexity applies since every element is compared.
- **Worst Case**: Similar to the average case, as the algorithm does not adapt to input.

---

## Space Complexity

Selection Sort is an **in-place sorting algorithm**, meaning it does not require additional memory proportional to the input size.  
**Space Complexity**: \( O(1) \).

---

# 3. Merge Sort Algorithm

Merge Sort is a **divide-and-conquer** sorting algorithm that recursively divides an array into two halves, sorts them, and then merges the sorted halves back together.

## Algorithm Explanation

Given an input array:

```
[50, 3, 2, 8, 90, 12, 26, 1]
```

Merge Sort works by:
1. Dividing the array into two halves recursively until each subarray contains a single element.
2. Merging the subarrays in sorted order.

## Java Implementation

```java
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
```

## How to Run

1. Compile the Java file:
   ```sh
   javac MergeSort.java
   ```
2. Run the Java program:
   ```sh
   java MergeSort
   ```

## Example Walkthrough

```
Input Array: [50, 3, 2, 8, 90, 12, 26, 1]
```

### Step-by-Step Sorting Process:
1. **Divide the array** into `[50, 3, 2, 8]` and `[90, 12, 26, 1]`.
2. Recursively divide until we get individual elements.
3. **Merge back** in sorted order:
   - `[3, 50]` → `[2, 8]` → `[2, 3, 8, 50]`
   - `[12, 90]` → `[1, 26]` → `[1, 12, 26, 90]`
   - Merge final halves → `[1, 2, 3, 8, 12, 26, 50, 90]`

## Final Sorted Array:
```
After sort: [1, 2, 3, 8, 12, 26, 50, 90]
```

## Time Complexity

| Case          | Time Complexity |
|--------------|-----------------|
| Best Case    | \( O(n \log n) \) |
| Average Case | \( O(n \log n) \) |
| Worst Case   | \( O(n \log n) \) |

## Space Complexity

Merge Sort is **not an in-place sorting algorithm**, meaning it requires additional memory for temporary arrays.
**Space Complexity**: \( O(n) \).

---

# 4. QuickSort Algorithm

QuickSort is an efficient sorting algorithm that uses a divide-and-conquer approach to sort an array by selecting a pivot and partitioning the elements around it.

## Algorithm Explanation

Given an input array:

```
[34, 12, 45, 3, 6, 7, 20]
```

QuickSort recursively partitions the array around a pivot element, ensuring elements on the left are smaller and elements on the right are larger.

## QuickSort Process

1. Select a pivot element.
2. Partition the array such that elements smaller than the pivot move to its left and larger ones move to its right.
3. Recursively apply QuickSort to the left and right partitions.

## Java Implementation

```java
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
```

## How to Run

1. Compile the Java file:
   ```sh
   javac QuickSort.java
   ```
2. Run the Java program:
   ```sh
   java QuickSort
   ```

## Example Walkthrough

```
Input Array: [34, 12, 45, 3, 6, 7, 20]
```

## Step-by-Step Sorting Process:

1. **Select Pivot**: Choose 20 as the pivot.
2. **Partitioning**:
   - Move elements < 20 to the left.
   - Move elements > 20 to the right.
3. **Recursive QuickSort on Left & Right sub-arrays**

## Time Complexity

| Case          | Time Complexity |
|--------------|-----------------|
| Best Case    | \( O(n \log n) \) |
| Average Case | \( O(n \log n) \) |
| Worst Case   | \( O(n^2) \)    |

## Explanation:
- **Best/Average Case**: Occurs when partitions are balanced, leading to \( O(n \log n) \) complexity.
- **Worst Case**: Occurs when partitions are highly unbalanced (e.g., sorted array with poor pivot selection), leading to \( O(n^2) \) complexity.

---

## Space Complexity

QuickSort is an **in-place sorting algorithm**, meaning it does not require extra space proportional to the input size.

**Space Complexity**: \( O(\log n) \) due to recursive stack calls.

---

# 5. Insertion Sort Algorithm

Insertion Sort is a simple and efficient comparison-based sorting algorithm. It builds the final sorted array one item at a time by taking elements from the unsorted portion and inserting them into their correct position.

## Algorithm Explanation

Given an input array:

```
[34, 12, 45, 3, 6, 7, 20]
```

Insertion Sort iterates through the array and moves each element to its correct position in the sorted part of the array.

## Java Implementation

```java
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
```

## How to Run

1. Compile the Java file:
   ```sh
   javac InsertionSort.java
   ```
2. Run the Java program:
   ```sh
   java InsertionSort
   ```

## Example Walkthrough

```
Input Array: [34, 12, 45, 3, 6, 7, 20]
```

### Step-by-Step Sorting Process:

1. **First Pass** (i = 1, key = 12):
   - Compare 12 and 34 → Swap → `[12, 34, 45, 3, 6, 7, 20]`

2. **Second Pass** (i = 2, key = 45):
   - No swap needed

3. **Third Pass** (i = 3, key = 3):
   - Compare 3 and 45 → Swap
   - Compare 3 and 34 → Swap
   - Compare 3 and 12 → Swap
   - `[3, 12, 34, 45, 6, 7, 20]`

4. **Fourth Pass** (i = 4, key = 6):
   - Compare 6 and 45 → Swap
   - Compare 6 and 34 → Swap
   - Compare 6 and 12 → Swap
   - `[3, 6, 12, 34, 45, 7, 20]`

5. **Fifth Pass** (i = 5, key = 7):
   - Compare 7 and 45 → Swap
   - Compare 7 and 34 → Swap
   - Compare 7 and 12 → Swap
   - `[3, 6, 7, 12, 34, 45, 20]`

6. **Sixth Pass** (i = 6, key = 20):
   - Compare 20 and 45 → Swap
   - Compare 20 and 34 → Swap
   - `[3, 6, 7, 12, 20, 34, 45]`

## Final Sorted Array:
```
After sort: 3 6 7 12 20 34 45
```

## Time Complexity

| Case          | Time Complexity |
|--------------|-----------------|
| Best Case    | \( O(n) \)      |
| Average Case | \( O(n^2) \)    |
| Worst Case   | \( O(n^2) \)    |

### Explanation:
- **Best Case**: The array is already sorted. The algorithm only makes one pass through the array with minimal comparisons.
- **Average Case**: The array elements are randomly arranged, requiring multiple shifts per element.
- **Worst Case**: The array is sorted in reverse order, requiring the maximum number of comparisons and shifts.

---

## Space Complexity

Insertion Sort is an **in-place sorting algorithm**, meaning it does not require additional memory proportional to the input size.

**Space Complexity**: \( O(1) \).

---