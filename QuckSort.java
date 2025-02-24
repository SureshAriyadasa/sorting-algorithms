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