//Orte, Rainan S
public class MergeSortLab {
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    
    static void merge(int[] a, int l, int m, int r) { //its so long 
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; ++i) L[i] = a[l + i];
        for (int j = 0; j < n2; ++j) R[j] = a[m + 1 + j];
        
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) { // the merging happens 
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) { a[k] = L[i]; i++; k++; } // Copy remaining elements of L[] if any
        while (j < n2) { a[k] = R[j]; j++; k++; }
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 1}; // Task 2 array
        System.out.println("Initial array: " + java.util.Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        for (int n : arr) System.out.print(n + " ");
    }
}